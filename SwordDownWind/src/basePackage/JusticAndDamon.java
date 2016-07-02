/*第二部分*/
package basePackage;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.omg.CORBA.PUBLIC_MEMBER;

public class JusticAndDamon extends JFrame{
	private Image mImage;
	private threadChange tc;
	public JusticAndDamon() {
		// TODO Auto-generated constructor stub
		tc = new threadChange(100);
		setTitle("正魔大战");  
        Toolkit tool = getToolkit();  
        Dimension dim = tool.getScreenSize();  
        setBounds(0, 0, LenthAll.WINDOW_WIDTH, LenthAll.WINDOW_HEIGHT); 
        this.setLocation((int)(dim.getWidth() - LenthAll.WINDOW_WIDTH) / 2,(int)(dim.getHeight() - LenthAll.WINDOW_HEIGHT) / 2);//设置当前窗口在屏幕的正中央
        this.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent event) {
				System.exit(0);
        	}
        });//设置关闭程序监听
        this.setResizable(false);//固定窗口大小，不可伸缩，最大化
        //----------------------以上是窗口创建-------------------------------------------------
        JPanel jp = (JPanel)this.getContentPane();
        ImageIcon icon1 = new ImageIcon("src/imageSource/war.jpg");
        ImageIcon icon3 = new ImageIcon("src/imageSource/war_2.jpg");
        ImageIcon icon2 = new ImageIcon("src/imageSource/back_3.jpg");
        ImageIcon icon4 = new ImageIcon("src/imageSource/back.jpg");
		JLabel cp1 = new JLabel(icon1);
		JLabel cp2 = new JLabel(icon2);
		JLabel cp3 = new JLabel(icon3);
		JLabel cp4 = new JLabel(icon4);
		jp.add(cp1);
		setVisible(true); 
		tc.run();//延时操作
		MyDialog.showMessageDialog("  "+"百年前，罗刹神殿出了一名绝世天才，只身渡过无尽，取得旷古烁\n  今的奇遇，回归之时，无尽海上，惊涛骇浪，电闪雷鸣，而此少年\n  手握雷光，如一柄神兵，在这极境之中，纹丝不动。",null,LenthAll.TALK_DIALOG_WIDTH,LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("  "+"在其回归之后十年，由其铁血手段，收复无尽海周边势力，更是凭\n  借着自己的绝世武功，一统魔门,此人流传百载，被后世称为罗刹\n  魔尊", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		jp.add(cp2);
		cp1.setVisible(false);
		cp2.setVisible(true);
		jp.repaint();
		MyDialog.showMessageDialog("  "+"收复魔门后，罗刹神尊的野心并未得到满足，率领一众魔兵入侵中\n  原，马踏山河。", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		jp.add(cp3);
		cp2.setVisible(false);
		cp3.setVisible(true);
		jp.repaint();
		MyDialog.showMessageDialog("  "+"当时中原第一人，一剑惊仙江浸月率领各大门派高手，组成斩魔精\n  英，与罗刹殿在断魂崖决一死战。那一战，可谓正魔历史上最惨烈\n  的一战。", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("  "+"大战之终便是江浸月和罗刹神尊纷纷坠崖陨落，罗刹神殿虽然数十\n  年来发展迅速，却依旧无法和正道千年的积蓄划上等号，罗刹神殿\n  几近全灭，正道也是大创而归，于是乎，江湖在此迎来了平静！", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		jp.add(cp4);
		cp3.setVisible(false);
		cp4.setVisible(true);
		MyDialog.showMessageDialog("  "+"    只是不知，这一世的江湖，又将掀起怎样的腥风血浪，", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		setVisible(false);
	}

}
