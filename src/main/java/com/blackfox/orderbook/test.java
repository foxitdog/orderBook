
/*******************************************************************************
 * Copyright (c) 2000, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.blackfox.orderbook;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

/*
 * Composite example snippet: scroll a child control automatically
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 */
//import org.eclipse.swt.*;
//import org.eclipse.swt.graphics.*;
//import org.eclipse.swt.layout.FillLayout;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.layout.RowLayout;
//import org.eclipse.swt.widgets.*;

import com.blackfox.orderbook.entity.ProductType;

public class test {

//static int pageNum = 0;
//static Composite pageComposite;

public static void main(String args[]) {
	
	List<String> list=new ArrayList<>();
	list.add("1");
	list.add("1");
	list.add("1");
	Stream<String> ss = list.stream().map(e->e);
	Object[] comboitems =  ss.toArray((a)-> new String[0]);
	for (Object object : comboitems) {
		
		System.out.println(object);
	}
//	Display display = new Display();
//	final Shell shell = new Shell(display);
//	shell.setLayout(new GridLayout());
//	Button button = new Button(shell, SWT.PUSH);
//	button.setText("Push");
//	pageComposite = new Composite(shell, SWT.NONE);
//	pageComposite.setLayout(new GridLayout());
//	pageComposite.setLayoutData(new GridData());
//
//	button.addListener(SWT.Selection, event -> {
//		if ((pageComposite != null) && (!pageComposite.isDisposed())) {
//			pageComposite.dispose();
//		}
//		pageComposite = new Composite(shell, SWT.NONE);
//		pageComposite.setLayout(new GridLayout());
//		pageComposite.setLayoutData(new GridData());
//		if (pageNum++ % 2 == 0) {
//			Table table = new Table(pageComposite, SWT.BORDER);
//			table.setLayoutData(new GridData());
//			for (int i = 0; i < 5; i++) {
//				new TableItem(table, SWT.NONE).setText("table item " + i);
//			}
//		} else {
//			new Button(pageComposite, SWT.RADIO).setText("radio");
//		}
//		shell.layout(true);
//	});
//
//	shell.open();
//	while (!shell.isDisposed()) {
//		if (!display.readAndDispatch())
//			display.sleep();
//	}
//	display.dispose();
}
}