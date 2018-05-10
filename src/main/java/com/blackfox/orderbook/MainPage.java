package com.blackfox.orderbook;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.ibatis.session.SqlSession;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.blackfox.orderbook.conf.MybatisConfig;
import com.blackfox.orderbook.dao.CustomerMapper;
import com.blackfox.orderbook.dao.ManufactorMapper;
import com.blackfox.orderbook.dao.OrderMapper;
import com.blackfox.orderbook.dao.ProductMapper;
import com.blackfox.orderbook.dao.ProductTypeMapper;
import com.blackfox.orderbook.entity.Customer;
import com.blackfox.orderbook.entity.CustomerExample;
import com.blackfox.orderbook.entity.Manufactor;
import com.blackfox.orderbook.entity.ManufactorExample;
import com.blackfox.orderbook.entity.Order;
import com.blackfox.orderbook.entity.OrderExample;
import com.blackfox.orderbook.entity.Product;
import com.blackfox.orderbook.entity.ProductExample;
import com.blackfox.orderbook.entity.ProductType;
import com.blackfox.orderbook.entity.ProductTypeExample;
import com.blackfox.orderbook.entity.PublicVar;
import com.blackfox.orderbook.utils.DialogUtils;

import swing2swt.layout.BorderLayout;
import org.eclipse.swt.widgets.Label;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.wb.swt.SWTResourceManager;

public class MainPage {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	protected Shell shell;
	private Table table;
	private JSONObject config;
	SqlSession session = null;
	Object cache;
	String title = "管理软件";
	public static String[] menusname = { "产品数据", "product", "客户数据", "customer", "销售数据", "order", "厂家数据", "manufactor",
			"产品类型", "productType" };
	/**
	 * product:产品 customer：客户 order：订单 manufactor：厂商
	 */
	private String nowTable = "product";

	public MainPage(SqlSession session) {
		this.session = session;
	}

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try (SqlSession session = MybatisConfig.getSqlSessionFactory().openSession(true)) {
			PublicVar.session = session;
			MainPage window = new MainPage(session);
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 * 
	 * @throws IOException
	 */
	public void open() throws IOException {
		config = JSON.parseObject(
				FileUtils.readFileToString(new File(this.getClass().getResource("/config.json").getFile()), "UTF-8"));
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setMaximized(true);
		// shell.setSize(450, 300);

		shell.setText(title + "  --  " + menusname[0]);
		shell.setImage(new Image(Display.getDefault(), this.getClass().getResourceAsStream("/icon.png")));
		shell.setLayout(new BorderLayout(0, 0));
		createMenu();

		Composite body = new Composite(shell, SWT.NONE);
		body.setLayoutData(BorderLayout.CENTER);
		body.setLayout(new FillLayout(SWT.HORIZONTAL));
		// tableComposite.setLayout(null);
		// table setting
		table = new Table(body, SWT.BORDER | SWT.FULL_SELECTION);

		// table.setBounds();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		Composite composite = new Composite(shell, SWT.BORDER);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setLayoutData(BorderLayout.EAST);
		GridLayout gl_composite = new GridLayout(2, false);
		gl_composite.marginRight = 20;
		gl_composite.marginWidth = 0;
		composite.setLayout(gl_composite);

		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText("New Label");

		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		lblNewLabel_1.setText("New Label");
		composite.addListener(SWT.Resize, e -> {
			System.out.println(e.getBounds());
		});
		table.addListener(SWT.Resize, e -> {
			System.out.println(table.getSize());
			Display.getCurrent().post(new Event());
		});
		table.addSelectionListener(new SelectionAdapter() {
			public void widgetDefaultSelected(SelectionEvent e) {
				// product:产品 customer：客户 order：订单 manufactor：厂商
				// switch (nowTable) {
				// case "product": {
				newEntry(nowTable, 1, ((List) cache).get(table.getSelectionIndex()));
				// }
				// break;
				// case "customer": {
				// newEntry(nowTable, 1, ((List) cache).get(table.getSelectionIndex()));
				// }
				// break;
				// case "order": {
				// newEntry(nowTable, 1, ((List) cache).get(table.getSelectionIndex()));
				// }
				// break;
				// case "manufactor": {
				// newEntry(nowTable, 1, ((List) cache).get(table.getSelectionIndex()));
				// }
				// case "producType": {
				// newEntry(nowTable, 1, ((List) cache).get(table.getSelectionIndex()));
				// }
				// break;
				// }
			}
		});
		int[] events = new int[] { SWT.Dispose, SWT.MouseDown, SWT.MouseExit, SWT.MouseMove, SWT.MouseUp, SWT.Paint,
				SWT.Resize };

		GridData gridData = new GridData(SWT.DEFAULT, SWT.DEFAULT);
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;

		// for (int i = 0; i < 5; i++) {
		// Composite order = new Composite(orders, SWT.NONE);
		// order.setLayout(new FillLayout(SWT.HORIZONTAL));
		// order.setLayoutData(new RowData(80, SWT.DEFAULT));
		// Label order_detail = new Label(order, SWT.NONE);
		// order_detail.setText("New Label\r\nhjk\r\nghjkhkj\r\njkhjkhjk");
		// }
		setTableContent();
	}

	private void setTableContent() {
		JSONArray columnsName = config.getJSONObject(nowTable).getJSONArray("columns_name");
		TableColumn[] tableColumns = table.getColumns();
		// Arrays.stream(tableColumns).
		String[] labels = new String[columnsName.size() + 1];
		labels[0] = "编号";
		for (int i = 0; i < columnsName.size(); i++) {
			labels[i + 1] = columnsName.getString(i);
		}
		int size = tableColumns.length;
		int columnSize = labels.length;
		for (int i = 0; i < columnSize; i++) {
			TableColumn tableColumn = null;
			if (i >= size) {
				tableColumn = new TableColumn(table, SWT.NONE);
				tableColumn.setWidth(100);
				tableColumn.setText(labels[i]);
			} else {
				tableColumn = tableColumns[i];
				tableColumn.setWidth(100);
				tableColumn.setText(labels[i]);
			}
		}
		if (size > columnSize) {
			for (int i = 0; i < size - columnSize; i++) {
				tableColumns[columnSize + i].dispose();
			}
		}
		updataTable();
	}

	private void updataTable() {
		TableItem[] items = table.getItems();
		// product:产品 customer：客户 order：订单 manufactor：厂商
		switch (nowTable) {
		case "product": {
			ProductExample pe = new ProductExample();
			pe.or().andZtEqualTo("0");
			List<Product> lists = session.getMapper(ProductMapper.class).selectByExample(pe);
			cache = lists;
			for (int i = 0; i < lists.size(); i++) {
				Product product = lists.get(i);
				String[] texts = { "" + (i + 1), product.getXh(), product.getMc(), product.getLx(), product.getCj(),
						product.getYj(), product.getDj(), product.getZddj(), product.getKcsl() };
				TableItem item = null;
				if (i >= items.length) {
					item = new TableItem(table, SWT.NONE);
					item.setText(texts);
				} else {
					item = items[i];
					item.setText(texts);
				}
			}
			if (items.length > lists.size()) {
				for (int i = 0; i < items.length - lists.size(); i++) {
					items[lists.size() + i].dispose();
				}
			}
		}
			break;
		case "customer": {
			CustomerExample ce = new CustomerExample();
			ce.or().andZtEqualTo("0");
			List<Customer> lists = session.getMapper(CustomerMapper.class).selectByExample(ce);
			cache = lists;
			for (int i = 0; i < lists.size(); i++) {
				Customer customer = lists.get(i);
				String[] texts = { "" + (i + 1), customer.getXm(), customer.getDhhm(), customer.getSjhm(),
						customer.getZj() };
				TableItem item = null;
				if (i >= items.length) {
					item = new TableItem(table, SWT.NONE);
					item.setText(texts);
				} else {
					item = items[i];
					item.setText(texts);
				}
			}
			if (items.length > lists.size()) {
				for (int i = 0; i < items.length - lists.size(); i++) {
					items[lists.size() + i].dispose();
				}
			}
		}

			break;
		case "order": {
			OrderExample oe = new OrderExample();
			oe.or().andZtEqualTo("0");
			List<Order> lists = session.getMapper(OrderMapper.class).selectByExample(oe);
			cache = lists;
			for (int i = 0; i < lists.size(); i++) {
				Order order = lists.get(i);
				String[] texts = { "" + (i + 1), order.getKhbh(), order.getDdje(), order.getYhje(), order.getDdzt() };
				TableItem item = null;
				if (i >= items.length) {
					item = new TableItem(table, SWT.NONE);
					item.setText(texts);
				} else {
					item = items[i];
					item.setText(texts);
				}
			}
			if (items.length > lists.size()) {
				for (int i = 0; i < items.length - lists.size(); i++) {
					items[lists.size() + i].dispose();
				}
			}
		}

			break;
		case "manufactor": {
			ManufactorExample me = new ManufactorExample();
			me.or().andZtEqualTo("0");
			List<Manufactor> lists = session.getMapper(ManufactorMapper.class).selectByExample(me);
			cache = lists;
			for (int i = 0; i < lists.size(); i++) {
				Manufactor manufactor = lists.get(i);
				String[] texts = { "" + (i + 1), manufactor.getCjmc(), manufactor.getCjhm(), manufactor.getCjdz() };
				TableItem item = null;
				if (i >= items.length) {
					item = new TableItem(table, SWT.NONE);
					item.setText(texts);
				} else {
					item = items[i];
					item.setText(texts);
				}
			}
			if (items.length > lists.size()) {
				for (int i = 0; i < items.length - lists.size(); i++) {
					items[lists.size() + i].dispose();
				}
			}
		}
			break;
		case "productType": {
			ProductTypeExample pe = new ProductTypeExample();
			pe.or().andZtEqualTo("0");
			List<ProductType> lists = session.getMapper(ProductTypeMapper.class).selectByExample(pe);
			cache = lists;
			for (int i = 0; i < lists.size(); i++) {
				ProductType productType = lists.get(i);
				String[] texts = { "" + (i + 1), productType.getType() };
				TableItem item = null;
				if (i >= items.length) {
					item = new TableItem(table, SWT.NONE);
					item.setText(texts);
				} else {
					item = items[i];
					item.setText(texts);
				}
			}
			if (items.length > lists.size()) {
				for (int i = 0; i < items.length - lists.size(); i++) {
					items[lists.size() + i].dispose();
				}
			}
		}
			break;
		default:
			break;
		}
	}

	private void createMenu() {
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);

		MenuItem start = new MenuItem(menu, SWT.CASCADE);
		start.setText("开始");

		Menu start_menu = new Menu(start);
		start.setMenu(start_menu);

		MenuItem edit = new MenuItem(start_menu, SWT.NONE);
		edit.setText("添加数据 \tCtrl+E");
		edit.setAccelerator(SWT.MOD1 + 'e');
		edit.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				newEntry(nowTable, 0, null);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		MenuItem deleteData = new MenuItem(start_menu, SWT.NONE);
		deleteData.setText("删除");
		deleteData.setAccelerator(SWT.DEL);

		MenuItem newOrder = new MenuItem(start_menu, SWT.NONE);
		newOrder.setText("填写订单");
		newOrder.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				OrderShell.NewOrder(shell,session);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		deleteData.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = table.getSelectionIndex();
				if (index > -1) {
					deleteDate(index);
					setTableContent();
				} else {
					DialogUtils.openDialog(shell, "请选择数据", "删除操作");
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		MenuItem dataTable = new MenuItem(menu, SWT.CASCADE);
		dataTable.setText("数据表");

		Menu dataTable_menu = new Menu(dataTable);
		dataTable.setMenu(dataTable_menu);
		// product:产品 customer：客户 order：订单 manufactor：厂商

		for (int i = 0; i < menusname.length / 2; i++) {
			final int j = i;
			MenuItem menuItem = new MenuItem(dataTable_menu, SWT.RADIO);
			String suffix = "";
			switch (i) {
			case 0:
				suffix = "P";
				menuItem.setAccelerator(SWT.MOD1 + 'P');
				break;
			case 1:
				suffix = "C";
				menuItem.setAccelerator(SWT.MOD1 + 'C');
				break;
			case 2:
				suffix = "O";
				menuItem.setAccelerator(SWT.MOD1 + 'O');
				break;
			case 3:
				suffix = "M";
				menuItem.setAccelerator(SWT.MOD1 + 'M');
				break;
			}
			menuItem.setText(menusname[j * 2] + ("".equals(suffix)?"":"\tCtrl+" + suffix));
			menuItem.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					System.out.println("widgetSelected");
					nowTable = menusname[j * 2 + 1];
					shell.setText(title + "  --  " + menusname[j * 2]);
					setTableContent();
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					System.out.println("widgetDefaultSelected");
					nowTable = menusname[j * 2 + 1];
					shell.setText(title + "  --  " + menusname[j * 2]);
					setTableContent();
				}
			});

		}
	}

	private void newEntry(String type, int operation, Object object) {
		DataEntryDialog dialog = new DataEntryDialog(shell, type, operation, session, object);
		JSONObject jo = config.getJSONObject(type);
		JSONArray columnsName = ((columnsName = jo.getJSONArray("columns_name")) == null ? new JSONArray()
				: columnsName);
		JSONArray reg = ((reg = jo.getJSONArray("reg")) == null ? new JSONArray() : reg);
		JSONArray message = ((message = jo.getJSONArray("message")) == null ? new JSONArray() : message);
		String[] labels = new String[columnsName.size()];
		for (int i = 0; i < columnsName.size(); i++) {
			labels[i] = columnsName.getString(i);
		}
		dialog.setLabels(labels);
		String[] regs = new String[reg.size()];
		for (int i = 0; i < reg.size(); i++) {
			regs[i] = reg.getString(i);
		}
		dialog.setReg(regs);
		String[] messages = new String[message.size()];
		for (int i = 0; i < message.size(); i++) {
			messages[i] = message.getString(i);
		}
		dialog.setMessage(messages);
		if (operation == 1) {
			switch (nowTable) {
			case "product": {
				Product product = (Product) object;
				String[] texts = { product.getXh(), product.getMc(), product.getLx(), product.getCj(), product.getYj(),
						product.getDj(), product.getZddj(), product.getKcsl() };
				dialog.setId(product.getId());
				dialog.setValues(texts);
			}
				break;
			case "customer": {
				Customer customer = (Customer) object;
				String[] texts = { customer.getXm(), customer.getDhhm(), customer.getSjhm(), customer.getZj() };
				dialog.setId(customer.getId());
				dialog.setValues(texts);
			}

				break;
			case "order": {
				Order order = (Order) object;
				String[] texts = { order.getKhbh(), order.getDdje(), order.getYhje(), order.getDdzt() };
				dialog.setId(order.getId());
				dialog.setValues(texts);
			}

				break;
			case "manufactor": {
				Manufactor manufactor = (Manufactor) object;
				String[] texts = { manufactor.getCjmc(), manufactor.getCjhm(), manufactor.getCjdz() };
				dialog.setId(manufactor.getId());
				dialog.setValues(texts);
			}
				break;
			case "productType": {
				ProductType productType = (ProductType) object;
				String[] texts = { productType.getType() };
				dialog.setId(productType.getId());
				dialog.setValues(texts);
			}
				break;
			default:
				break;
			}
		}
		dialog.open();
		updataTable();
	}

	private void deleteDate(int selectionIndex) {
		switch (nowTable) {

		case "product": {
			Product product = ((List<Product>) cache).get(selectionIndex);
			product.setZt("1");
			product.setZtbgsj(LocalDateTime.now().format(dtf));
			session.getMapper(ProductMapper.class).updateByPrimaryKeySelective(product);
		}
			break;
		case "customer": {
			Customer customer = ((List<Customer>) cache).get(selectionIndex);
			customer.setZt("1");
			customer.setZtbgsj(LocalDateTime.now().format(dtf));
			session.getMapper(CustomerMapper.class).updateByPrimaryKeySelective(customer);
		}
			break;
		case "order": {
			Order order = ((List<Order>) cache).get(selectionIndex);
			order.setZt("1");
			order.setZtbgsj(LocalDateTime.now().format(dtf));
			session.getMapper(OrderMapper.class).updateByPrimaryKeySelective(order);
		}

			break;
		case "manufactor": {
			Manufactor manufactor = ((List<Manufactor>) cache).get(selectionIndex);
			manufactor.setZt("1");
			manufactor.setZtbgsj(LocalDateTime.now().format(dtf));
			session.getMapper(ManufactorMapper.class).updateByPrimaryKeySelective(manufactor);
		}
			break;
		case "productType": {
			ProductType productType = ((List<ProductType>) cache).get(selectionIndex);
			productType.setZt("1");
			productType.setZtbgsj(LocalDateTime.now().format(dtf));
			session.getMapper(ProductTypeMapper.class).updateByPrimaryKeySelective(productType);
		}
			break;
		default:
			break;
		}
	}
}
