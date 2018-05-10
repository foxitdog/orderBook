package com.blackfox.orderbook.utils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class DialogUtils {
	public static int openDialog(Shell shell,String message, String title) {
		MessageBox dialog = new MessageBox(shell, SWT.OK | SWT.ICON_WARNING);
		dialog.setMessage(message);
		if (title != null) {
			dialog.setText(title);
		}
		return dialog.open();
	}
	public static int openConfirmDialog(Shell shell,String message, String title) {
		MessageBox dialog = new MessageBox(shell, SWT.OK |SWT.CANCEL| SWT.ICON_WARNING);
		dialog.setMessage(message);
		if (title != null) {
			dialog.setText(title);
		}
		return dialog.open();
	}
}
