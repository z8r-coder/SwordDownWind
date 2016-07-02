/*第四部分*/
package basePackage;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstSection extends JFrame{
	private threadChange tc;
	public FirstSection() {
		// TODO Auto-generated constructor stub
		tc = new threadChange(100);
		setTitle("第一章：云深不知年几许");  
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
        //--------------------------------------------------------------------------
        ImageIcon icon = new ImageIcon("src/imageSource/nightTown.jpg");
        ImageIcon icon_1 = new ImageIcon("src/imageSource/inHome.jpg");
        ImageIcon icon_2 = new ImageIcon("src/imageSource/furen.jpg");
        ImageIcon icon_3 = new ImageIcon("src/imageSource/voilet.jpg");
        ImageIcon icon_4 = new ImageIcon("src/imageSource/leavetantai.jpg");
        JLabel jl = new JLabel(icon);
        JLabel jl_1 = new JLabel(icon_1);
        JLabel jl_2 = new JLabel(icon_2);
        JLabel jl_3 = new JLabel(icon_3);
        JLabel jl_4 = new JLabel(icon_4);
        jp.add(jl);
        setVisible(true);
        tc.run();
        MyDialog.showMessageDialog("  "+"呲呲。。。。。。", "夜深人静的离云镇", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"娘,爹爹怎么还没回来？我快要饿死了。", "稚嫩童音", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jp.add(jl_1);
        jl.setVisible(false);
        jl_1.setVisible(true);
        MyDialog.showMessageDialog("  "+"再等等，这是你爹帮刘二叔铸了把斧子换来的，所以要等爹爹回来\n  才能吃。", "澹台湘", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jp.add(jl_3);
        jl_1.setVisible(false);
        jl_3.setVisible(true);
        MyDialog.showMessageDialog("  "+"哑...............。砰....（屋外传来一阵紫色的光芒，并有一道剑吟随风\n  传来）", "屋外一阵怪声", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jl_3.setVisible(false);
        jl_1.setVisible(true);
        MyDialog.showMessageDialog("  "+"澹台湘站起身来，面色慌张不慎撞到了身下的椅子。", "屋内", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("                                            "+"（面色惊吓）娘，您怎么了", "小惊寒", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("                     "+"                                唰唰...............", null, LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jp.add(jl_2);
        jl_1.setVisible(false);
        jl_2.setVisible(true);
        MyDialog.showMessageDialog("  "+"九叔...........您怎么来了............(九叔，是村里的一位裁缝商人。平日\n  里对燕惊寒一家人极为照顾。)", "小惊寒", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jl_2.setVisible(false);
        jl_1.setVisible(true);
        MyDialog.showMessageDialog("  "+"                             （单膝跪下）属下愿拼死护大小姐安危！", "伏刃", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"想必你也看见了吧,我现在交给你最后一件任务，做到了，你便自\n  由了，不再受任何人的约束。", "澹台湘", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"大小姐，伏刃明白，你早将伏刃当作朋友。朋友有难就当两肋插刀\n  。伏刃虽然武功低微，但绝非贪生怕死之辈，弃友而逃，我做不到\n  。", "伏刃", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"伏刃，我当然明白你是顶天立地的男子汉，但惊寒必须安全离开，\n  这才是最重要的。也是我和南征所希望的。", "澹台湘", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"                                                      小姐，可是……","伏刃", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"够了，我们做了一辈子的朋友。但今日，我是主，你是仆。我命令\n  你立马将小少爷送到清州城内一家叫做“万里飘香”的酒楼，不得\n  违命。", "澹台湘", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"(摘下脖子上的仙鹤饮泉的玉佩挂在小惊寒脖子上)寒儿，要学会自\n  己照顾自己，保护自己，做个善良的人。", "澹台湘", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jp.add(jl_4);
        jl_1.setVisible(false);
        jl_4.setVisible(true);
        MyDialog.showMessageDialog("  "+"         (飞身出屋)多想看着你长大啊……勿寻，勿念，保重。", "澹台湘", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        setVisible(false);
	}
}
