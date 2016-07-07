/*第三部分*/
package basePackage;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.sound.midi.ShortMessage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Prologue extends JFrame{
	private threadChange tc;
	public Prologue() {
		// TODO Auto-generated constructor stub
		tc = new threadChange(100);
		setTitle("序章：琅琊山颠");  
        Toolkit tool = getToolkit();  
        Dimension dim = tool.getScreenSize();  
        setBounds(0, 0, LenthAll.WINDOW_WIDTH, LenthAll.WINDOW_HEIGHT); 
        this.setLocation((int)(dim.getWidth() - LenthAll.WINDOW_WIDTH) / 2,(int)(dim.getHeight() - LenthAll.WINDOW_HEIGHT) / 2);//设置当前窗口在屏幕的正中央
        this.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent event) {
				System.exit(0);
        	}
        });//设置关闭程序监听
        JPanel jp = (JPanel) getContentPane();
        this.setResizable(false);//固定窗口大小，不可伸缩，最大化
        //-------------------------窗口建立分割线-----------------------------------------
        ImageIcon icon = new ImageIcon("src/imageSource/snow.jpg");
        JLabel jl = new JLabel(icon);
        jp.add(jl);
        setVisible(true);
        
        MyDialog.showMessageDialog("                                                   "+"你还是如此执着!", "白衣男子", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("                                                   "+"你来了"+"............\n                                            我想与你下一盘棋！", "青衣男子", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("                                    "+"哈哈.......我们似乎很久没有对弈过了!", "白衣男子",LenthAll.TALK_DIALOG_WIDTH , LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("                                                   "+"从她走的那天起！", "青衣男子", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        setVisible(false);
        new FirstSection();
	}
}
