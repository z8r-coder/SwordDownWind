package basePackage;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyDialog{
	public static Object showMessageDialog(Object message,
			String title,int width,int height){
		JOptionPane pane = new JOptionPane(message);
		//pane.setWantsInput(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		pane.setBorder(null);
		JDialog mDialog = pane.createDialog(title);
		mDialog.setSize(width,height);
		mDialog.setLocation((int)(dim.getWidth() - width) / 2, 500);
		mDialog.show();
		mDialog.dispose();
		Object value = pane.getInputValue();
		if(value == JOptionPane.UNINITIALIZED_VALUE)
			return null;
		return value;
	}
}
