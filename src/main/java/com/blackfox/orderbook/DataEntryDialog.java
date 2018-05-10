/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.blackfox.orderbook;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
/* Imports */
import org.eclipse.swt.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

import com.alibaba.fastjson.JSONArray;
import com.blackfox.orderbook.conf.MybatisConfig;
import com.blackfox.orderbook.dao.CustomerMapper;
import com.blackfox.orderbook.dao.ManufactorMapper;
import com.blackfox.orderbook.dao.OrderMapper;
import com.blackfox.orderbook.dao.ProductMapper;
import com.blackfox.orderbook.dao.ProductTypeMapper;
import com.blackfox.orderbook.entity.Customer;
import com.blackfox.orderbook.entity.Manufactor;
import com.blackfox.orderbook.entity.Order;
import com.blackfox.orderbook.entity.Product;
import com.blackfox.orderbook.entity.ProductType;
import com.blackfox.orderbook.entity.ProductTypeExample;
import com.blackfox.orderbook.utils.DialogUtils;

import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * DataEntryDialog class uses <code>org.eclipse.swt</code> libraries to
 * implement a dialog that accepts basic personal information that is added to a
 * <code>Table</code> widget or edits a <code>TableItem</code> entry to
 * represent the entered data.
 */
public class DataEntryDialog {

	Shell shell;
	String[] values;
	String[] labels;
	SqlSession session;
	Object object;
	List<ProductType> list;
	/**
	 * 0:添加 1：修改
	 */
	int operation;
	/**
	 * product:产品 customer：客户 order：订单 manufactor：厂商
	 */
	String type;

	int id;

	String[] message;
	String[] reg;

	public void setMessage(String[] message) {
		this.message = message;
	}

	public void setReg(String[] reg) {
		this.reg = reg;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DataEntryDialog(Shell parent, String type, int operation, SqlSession session, Object object) {
		this.type = type;
		this.operation = operation;
		this.session = session;
		this.object = object;
		shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.PRIMARY_MODAL);
		shell.setLayout(new GridLayout());
		if ("product".equals(type)) {
			ProductTypeExample pte = new ProductTypeExample();
			list = session.getMapper(ProductTypeMapper.class).selectByExample(pte);
		}
	}

	private void addTextListener(final Text text) {
		text.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				Integer index = (Integer) (text.getData("index"));
				values[index.intValue()] = text.getText();
			}
		});
	}

	private void createControlButtons() {
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);

		Button okButton = new Button(composite, SWT.PUSH);
		okButton.setText("确定");
		okButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				/*
				 * product:产品 customer：客户 order：订单 manufactor：厂商
				 */
				if (reg != null && reg.length == values.length) {
					for (int i = 0; i < reg.length; i++) {
						if (reg[i] != null && !"".equals(reg[i])
								&& !(values[i] == null ? "" : values[i]).matches(reg[i])) {
							System.out.println(reg[i]);
							if (message != null && message.length == reg.length && message[i] != null) {
								DialogUtils.openDialog(shell, labels[i] + "：" + message[i],
										operation == 0 ? "添加操作" : "修改操作");
							} else {
								DialogUtils.openDialog(shell, labels[i] + "：不符合规则", operation == 0 ? "添加操作" : "修改操作");
							}
							return;
						}
					}
				} else {
					// System.out.println("正则不匹配");
				}
				if (operation == 0) {
					switch (type) {
					case "product":
						handleProduct();
						break;
					case "customer":
						handleCustomer();
						break;
					case "order":
						handleOrder();
						break;
					case "manufactor":
						handleManufactor();
						break;
					case "productType":
						handleProductType();
						break;
					}
				} else {
					switch (type) {
					case "product":
						updateProduct();
						break;
					case "customer":
						updateCustomer();
						break;
					case "order":
						updateOrder();
						break;
					case "manufactor":
						updateManufactor();
						break;
					case "productType":
						updateProductType();
						break;
					}
				}
				shell.close();
			}

		});

		Button cancelButton = new Button(composite, SWT.PUSH);
		cancelButton.setText("取消");
		cancelButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				values = null;
				shell.close();
			}
		});

		shell.setDefaultButton(okButton);
	}

	private void createTextWidgets() {
		if (labels == null)
			return;

		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);

		if (values == null)
			values = new String[labels.length];

		for (int i = 0; i < labels.length; i++) {
			Label label = new Label(composite, SWT.RIGHT);
			label.setText(labels[i] + ":");
			if ("product".equals(type) && labels[i].equals("类型")) {
				Combo combo = new Combo(composite, SWT.NONE);
				String[] comboitems = list.stream().map(e -> e.getType()).toArray(e -> new String[e]);
				combo.setItems(comboitems);
//				GridData gridData = new GridData();
//				gridData.widthHint = 400;
//				combo.setLayoutData(gridData);
				if (values[i] != null) {
					combo.setText(values[i]);
				}
				final int index=i;
				combo.addModifyListener(e -> {
					values[index] = combo.getText();
				});
			} else {
				Text text = new Text(composite, SWT.BORDER);
				GridData gridData = new GridData();
				gridData.widthHint = 400;
				text.setLayoutData(gridData);
				if (values[i] != null) {
					text.setText(values[i]);
				}
				text.setData("index", new Integer(i));
				addTextListener(text);
			}
		}
	}

	public String[] getLabels() {
		return labels;
	}

	public String getTitle() {
		return shell.getText();
	}

	/**
	 * Returns the contents of the <code>Text</code> widgets in the dialog in a
	 * <code>String</code> array.
	 *
	 * @return String[] The contents of the text widgets of the dialog. May return
	 *         null if all text widgets are empty.
	 */
	public String[] getValues() {
		return values;
	}

	/**
	 * Opens the dialog in the given state. Sets <code>Text</code> widget contents
	 * and dialog behaviour accordingly.
	 *
	 * @param dialogState
	 *            int The state the dialog should be opened in.
	 */
	public String[] open() {
		// switch (type) {
		// case "":
		//
		// break;
		//
		// default:
		// break;
		// }
		// shell.setText(title + " -- " + menusname[0]);
		shell.setImage(new Image(Display.getDefault(), this.getClass().getResourceAsStream("/icon.png")));
		createTextWidgets();
		createControlButtons();
		shell.pack();
		shell.open();
		Display display = shell.getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}

		return getValues();
	}

	public void setLabels(String[] label) {
		this.labels = label;
	}

	public void setTitle(String title) {
		shell.setText(title);
	}

	/**
	 * Sets the values of the <code>Text</code> widgets of the dialog to the values
	 * supplied in the parameter array.
	 *
	 * @param itemInfo
	 *            String[] The values to which the dialog contents will be set.
	 */
	public void setValues(String[] itemInfo) {
		if (labels == null)
			return;

		if (values == null)
			values = new String[labels.length];

		int numItems = Math.min(values.length, itemInfo.length);
		for (int i = 0; i < numItems; i++) {
			values[i] = itemInfo[i];
		}
	}

	private void handleManufactor() {
		Manufactor entry = new Manufactor();
		entry.setCjmc(values[0]);
		entry.setCjhm(values[1]);
		entry.setCjdz(values[2]);
		session.getMapper(ManufactorMapper.class).insertSelective(entry);
	}

	private void handleOrder() {
		Order entry = new Order();
		entry.setKhbh(values[0]);
		entry.setDdje(values[1]);
		entry.setYhje(values[2]);
		entry.setDdzt(values[3]);
		session.getMapper(OrderMapper.class).insertSelective(entry);
	}

	private void handleCustomer() {
		Customer entry = new Customer();
		entry.setXm(values[0]);
		entry.setDhhm(values[1]);
		entry.setSjhm(values[2]);
		entry.setZj(values[3]);
		session.getMapper(CustomerMapper.class).insertSelective(entry);
	}

	private void handleProduct() {
		Product entry = new Product();
		entry.setXh(values[0]);
		entry.setMc(values[1]);
		entry.setLx(values[2]);
		entry.setCj(values[3]);
		entry.setYj(values[4]);
		entry.setDj(values[5]);
		entry.setZddj(values[6]);
		entry.setKcsl(values[7]);
		session.getMapper(ProductMapper.class).insertSelective(entry);
	}

	private void handleProductType() {
		ProductType entry = new ProductType();
		entry.setType(values[0]);
		session.getMapper(ProductTypeMapper.class).insertSelective(entry);
	}

	private void updateManufactor() {
		Manufactor entry = new Manufactor();
		entry.setCjmc(values[0]);
		entry.setCjhm(values[1]);
		entry.setCjdz(values[2]);
		entry.setId(id);
		session.getMapper(ManufactorMapper.class).updateByPrimaryKeySelective(entry);
	}

	private void updateOrder() {
		Order entry = new Order();
		entry.setKhbh(values[0]);
		entry.setDdje(values[1]);
		entry.setYhje(values[2]);
		entry.setDdzt(values[3]);
		entry.setId(id);
		session.getMapper(OrderMapper.class).updateByPrimaryKeySelective(entry);
	}

	private void updateCustomer() {
		Customer entry = new Customer();
		entry.setXm(values[0]);
		entry.setDhhm(values[1]);
		entry.setSjhm(values[2]);
		entry.setZj(values[3]);
		entry.setId(id);
		session.getMapper(CustomerMapper.class).updateByPrimaryKeySelective(entry);
	}

	private void updateProduct() {
		Product entry = new Product();
		entry.setXh(values[0]);
		entry.setMc(values[1]);
		entry.setLx(values[2]);
		entry.setCj(values[3]);
		entry.setYj(values[4]);
		entry.setDj(values[5]);
		entry.setZddj(values[6]);
		entry.setKcsl(values[7]);
		entry.setId(id);
		session.getMapper(ProductMapper.class).updateByPrimaryKeySelective(entry);
	}

	private void updateProductType() {
		ProductType entry = new ProductType();
		entry.setType(values[0]);
		entry.setId(id);
		session.getMapper(ProductTypeMapper.class).updateByPrimaryKeySelective(entry);
	}
}
