package basePackage;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class jiulou extends JFrame{
	private JPanel jp;
	public jiulou() {
		// TODO Auto-generated constructor stub
		setTitle("第三章：一入江湖深似海");
		Toolkit tool = getToolkit();
		Dimension dim = tool.getScreenSize();
		setBounds(0, 0, LenthAll.WINDOW_WIDTH, LenthAll.WINDOW_HEIGHT);
		this.setLocation((int) (dim.getWidth() - LenthAll.WINDOW_WIDTH) / 2,
				(int) (dim.getHeight() - LenthAll.WINDOW_HEIGHT) / 2);// 设置当前窗口在屏幕的正中央
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		});// 设置关闭程序监听
		jp = (JPanel) getContentPane();
		this.setResizable(false);// 固定窗口大小，不可伸缩，最大化
		setVisible(true);
		/*-------------------------windows create---------------------------------*/
		ImageIcon icon = new ImageIcon("src/imageSource/insidehome.jpg");
		
		JLabel insidehome = new JLabel(icon);
		jp.add(insidehome);
		jp.validate();
		MyDialog.showMessageDialog("                       小二，请问您们老板娘在吗？", "燕惊寒", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                         哦，我们老板娘有事去渝州了，明天才会回来！","酒店小二", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                        哦，好的，那麻烦你帮我开一间上等房！", "燕惊寒",LenthAll.TALK_DIALOG_WIDTH , LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("                                                        翌日", "提示", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
	}
}
