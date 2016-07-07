/*第一部分*/
package basePackage;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.omg.CORBA.PUBLIC_MEMBER;

public class liyunMap extends JFrame{
	private Image mImage;
	private threadChange tc;
	public liyunMap() {
		// TODO Auto-generated constructor stub
		tc = new threadChange(100);
		setTitle("五百年前的历史");  
        Toolkit tool = getToolkit();  
        Dimension dim = tool.getScreenSize();  
        setBounds(0, 0, LenthAll.WINDOW_WIDTH, LenthAll.WINDOW_HEIGHT); 
        this.setLocation((int)(dim.getWidth() - LenthAll.WINDOW_WIDTH) / 2,(int)(dim.getHeight() - LenthAll.WINDOW_HEIGHT) / 2);//设置当前窗口在屏幕的正中央
        this.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent event) {
				System.exit(0);
        	}
        });//设置关闭程序监听
        //--------------------------------------------------------------------------
        ImageIcon icon1=new ImageIcon("src/imageSource/bieyunmountain.jpg");
		JLabel cp1=new JLabel(icon1);
		cp1.setIcon(icon1);
		this.add(cp1);
		this.setResizable(false);//固定窗口大小，不可伸缩，最大化
		tc.run();//延时操作
		setVisible(true);
		MyDialog.showMessageDialog("  "+"五百年前,离云镇不远处的别云山上金光乍现，以为神迹，引来万\n  方修士膜拜瞻仰。",null,LenthAll.TALK_DIALOG_WIDTH,LenthAll.TALK_DIALOG_HEIGHT);//参数分别是上下文，内容，标题，和ICON
		//JOptionPane.showMessageDialog(this,"hello world","alert",JOptionPane.WARNING_MESSAGE);
		MyDialog.showMessageDialog("  "+"便以为有仙人临尘，纷纷齐聚于此，希望得到仙人点化，江湖高\n  手纷纷山上寻觅，妄图寻得仙缘，肉身成圣，奈何竹篮子打水一\n  场空，整个别云山除了青山翠竹，缥缈云雾，便再无他物。", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		MyDialog.showMessageDialog("  "+"众人失望之极，纷纷离开离云镇，但有一群人自称寻仙者，始终恭\n  敬如初，不像其他的江湖来访者，肆意上山，他们始终在山下等待\n  虔诚，谦卑。在众人失望而归之时，他们也不曾想过离去，默默守\n  护百年，后代也在此扎根，不复外出。不知是否真有神灵护佑，百\n  年前的正魔大战何其壮烈，却也未波及至此。", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
		setVisible(false);
		new JusticAndDamon();
	}
}
