package com.blackfox.orderbook;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import com.blackfox.orderbook.dao.ProductMapper;
import com.blackfox.orderbook.dao.ProductTypeMapper;
import com.blackfox.orderbook.entity.OrderDetail;
import com.blackfox.orderbook.entity.Product;
import com.blackfox.orderbook.entity.ProductExample;
import com.blackfox.orderbook.entity.ProductType;
import com.blackfox.orderbook.entity.ProductTypeExample;
import com.blackfox.orderbook.utils.DialogUtils;

import swing2swt.layout.FlowLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;

public class OrderShell extends Shell {
	private Table table;
	private Text finalPrice;
	private Text price;
	private Text tip;
	private Label orderTotalPrice;
	private Button addProduct;
	private Label totalPrice;
	private Spinner number;
	private Combo products;
	SqlSession session = null;
	List<ProductType> list = null;
	List<Product> productList = null;
	Product select;
	String[] productsName;
	List<OrderDetail> orders=new ArrayList<>();
	private String ddbh;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void NewOrder(Shell parent, SqlSession session) {
		try {
			OrderShell shell = new OrderShell(parent, session);
			shell.open();
			shell.layout();
			Display display = shell.getDisplay();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the shell.
	 * 
	 * @param shell
	 * 
	 * @param session
	 */
	public OrderShell(Shell shell, SqlSession session) {
		super(shell, SWT.CLOSE | SWT.TITLE | SWT.DIALOG_TRIM | SWT.PRIMARY_MODAL);
		this.session = session;
		ddbh = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
		ProductTypeExample pte = new ProductTypeExample();
		list = session.getMapper(ProductTypeMapper.class).selectByExample(pte);
		setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite composite_3 = new Composite(this, SWT.NONE);
		composite_3.setLayout(new RowLayout(SWT.HORIZONTAL));

		Composite table_body = new Composite(composite_3, SWT.BORDER);
		table_body.setLayoutData(new RowData(412, 132));
		table_body.setLayout(new FillLayout(SWT.HORIZONTAL));

		table = new Table(table_body, SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		String[] columns = { "型号", "类型", "数量", "单价", "总价" };
		for (String colName : columns) {
			TableColumn tc = new TableColumn(table, SWT.NONE);
			tc.setText(colName);
			tc.setWidth(50);
		}

		Composite composite = new Composite(composite_3, SWT.BORDER);
		RowLayout rl_composite = new RowLayout(SWT.VERTICAL);
		rl_composite.justify = true;
		rl_composite.pack = false;
		composite.setLayout(rl_composite);

		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayoutData(new RowData(400, SWT.DEFAULT));
		composite_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		Label lblNewLabel = new Label(composite_1, SWT.NONE);
		lblNewLabel.setText("类型：");

		Combo combo = new Combo(composite_1, SWT.NONE);
		String[] comboitems = list.stream().map(e -> e.getType()).toArray(e -> new String[e]);
		combo.setItems(comboitems);
		combo.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				String key = combo.getText();
				for (String name : comboitems) {
					if (name.equals(key)) {
						products.setEnabled(true);
						ProductExample pe = new ProductExample();
						pe.or().andLxEqualTo(key);
						productList = session.getMapper(ProductMapper.class).selectByExample(pe);
						productsName = productList.stream().map(pro -> pro.getXh()).toArray(val -> new String[val]);
						products.setItems(productsName);
					}
				}
			}
		});
		Composite composite_4 = new Composite(composite, SWT.NONE);
		composite_4.setLayoutData(new RowData(400, SWT.DEFAULT));
		composite_4.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		Label lblNewLabel_2 = new Label(composite_4, SWT.NONE);
		lblNewLabel_2.setText("型号：");

		products = new Combo(composite_4, SWT.NONE);
		products.setEnabled(false);
		products.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				String key = products.getText();
				for (String name : productsName) {
					if (name.equals(key)) {
						productList.stream().anyMatch((Product p) -> {
							if (key.equals(p.getXh())) {
								select = p;
								return true;
							} else {
								return false;
							}
						});
						number.setEnabled(true);
						addProduct.setEnabled(true);
						price.setEnabled(true);
						price.setText(select.getDj());
						number.setSelection(1);
						totalPrice.setText(Double.valueOf(select.getDj()) * number.getSelection() + " 元");
						totalPrice.requestLayout();
					}
				}
			}
		});

		Composite composite_5 = new Composite(composite, SWT.NONE);
		composite_5.setLayoutData(new RowData(406, -1));
		composite_5.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		Label lblNewLabel_1 = new Label(composite_5, SWT.NONE);
		lblNewLabel_1.setText("数量：");

		number = new Spinner(composite_5, SWT.BORDER);
		number.setEnabled(false);
		number.addModifyListener((e) -> {
			totalPrice.setText("" + Double.valueOf(price.getText()) * number.getSelection() + " 元");
			totalPrice.requestLayout();
		});

		Label lblNewLabel_7 = new Label(composite_5, SWT.NONE);
		lblNewLabel_7.setText("单价：");

		price = new Text(composite_5, SWT.BORDER);
		price.setEnabled(false);
		price.addModifyListener((e) -> {
			if (!price.getText().matches("^\\d+\\.?\\d*$")) {
				price.setText("0");
			}
			totalPrice.setText("" + Double.valueOf(price.getText()) * number.getSelection() + " 元");
			totalPrice.requestLayout();
		});

		Label lblNewLabel_3 = new Label(composite_5, SWT.NONE);
		lblNewLabel_3.setText("总价：");

		totalPrice = new Label(composite_5, SWT.WRAP);
		// totalPrice.setLayoutData();
		totalPrice.setSize(150, SWT.DEFAULT);
		totalPrice.setText("0 元");

		addProduct = new Button(composite, SWT.NONE);
		addProduct.setLayoutData(new RowData(400, SWT.DEFAULT));
		addProduct.setText("添加商品");
		addProduct.setEnabled(false);
		addProduct.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseUp(MouseEvent e) {
				OrderDetail od = new OrderDetail();
				od.setDj(price.getText());
				od.setDdbh(ddbh);
				od.setSl("" + number.getSelection());
				od.setSpbh("" + select.getId());
				od.product = select;
				orders.add(od);
				updateTable();
			}
			@Override
			public void mouseDown(MouseEvent e) {
				
			}
			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});

		Composite composite_6 = new Composite(composite_3, SWT.BORDER);
		composite_6.setLayoutData(new RowData(414, 273));
		composite_6.setLayout(new RowLayout(SWT.VERTICAL));

		Composite composite_7 = new Composite(composite_6, SWT.NONE);
		composite_7.setLayoutData(new RowData(406, SWT.DEFAULT));
		composite_7.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		Label label = new Label(composite_7, SWT.NONE);
		label.setText("订单总价：");

		orderTotalPrice = new Label(composite_7, SWT.NONE);
		orderTotalPrice.setText("0元");

		Composite composite_8 = new Composite(composite_6, SWT.NONE);
		composite_8.setLayoutData(new RowData(406, SWT.DEFAULT));
		composite_8.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		Label lblNewLabel_6 = new Label(composite_8, SWT.NONE);
		lblNewLabel_6.setText("确认价钱：");

		finalPrice = new Text(composite_8, SWT.BORDER);
		finalPrice.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				if (!price.getText().matches("^\\d+\\.?\\d*$")) {
					price.setText("0");
				}
			}
		});

		Label lblNewLabel_8 = new Label(composite_8, SWT.NONE);
		lblNewLabel_8.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblNewLabel_8.setText("*");
		
				tip = new Text(composite_6, SWT.BORDER | SWT.MULTI);
				tip.setToolTipText("备注");
				tip.setLayoutData(new RowData(400, 68));
		
		Composite composite_2 = new Composite(composite_6, SWT.BORDER);
		composite_2.setLayoutData(new RowData(401, 79));
		RowLayout rl_composite_2 = new RowLayout(SWT.VERTICAL);
		rl_composite_2.wrap = false;
		composite_2.setLayout(rl_composite_2);
		
		Label customInfo = new Label(composite_2, SWT.NONE);
		customInfo.setLayoutData(new RowData(396, 39));
		customInfo.setText("未选择用户");
		
		Button addCustomer = new Button(composite_2, SWT.NONE);
		addCustomer.setLayoutData(new RowData(395, SWT.DEFAULT));
		addCustomer.setText("添加客户");

		Button ok = new Button(composite_6, SWT.NONE);
		ok.setLayoutData(new RowData(402, SWT.DEFAULT));
		ok.setText("确定订单");
		ok.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseUp(MouseEvent e) {
				DialogUtils.openConfirmDialog(shell, "订单总价："+finalPrice.getText()+"\r\n确认提交订单吗？", "提交订单");
			}
			
			@Override
			public void mouseDown(MouseEvent e) {
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});

		Canvas image = new Canvas(composite_3, SWT.NONE);
		image.setLayout(new FormLayout());
		image.setLayoutData(new RowData(416, 158));
		;
		Image img = new Image(shell.getDisplay(),
				this.getClass().getResourceAsStream("/icon.png"));
		image.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				e.gc.drawImage(img, 0, 0);
			}
		});
		createContents();
	}

	// String[] columns = { "型号", "类型", "数量", "单价", "总价" };
	private void updateTable() {
		TableItem[] items = table.getItems();
		int ordersTotalPrice=0;
		for (int i = 0; i < orders.size(); i++) {
			OrderDetail orderDetail = orders.get(i);
			int orderPrice=Integer.parseInt(orderDetail.getSl()) * Integer.parseInt(orderDetail.getDj());
			ordersTotalPrice+=orderPrice;
			String[] texts = { orderDetail.product.getXh(), orderDetail.product.getLx(), orderDetail.getSl(),
					orderDetail.getDj(),
					"" + orderPrice };
			TableItem item = null;
			if (i >= items.length) {
				item = new TableItem(table, SWT.NONE);
				item.setText(texts);
			} else {
				item = items[i];
				item.setText(texts);
			}
		}
		if (items.length > orders.size()) {
			for (int i = 0; i < items.length - orders.size(); i++) {
				items[orders.size() + i].dispose();
			}
		}
		orderTotalPrice.setText(""+ordersTotalPrice+"元");
		orderTotalPrice.requestLayout();
	}

	void clearState() {
		products.setItems(null);
		products.setText(null);
		products.setEnabled(false);
		number.setDigits(0);
		number.setEnabled(false);
		price.setText(null);
		price.setEnabled(false);
		totalPrice.setText("0 元");
		orderTotalPrice.setText("0 元");
		addProduct.setEnabled(false);
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("新建订单："+ddbh);
		setSize(428, 759);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
