/*第八部分，游戏开始部分*/
package basePackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.NonWritableChannelException;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameStart extends JFrame implements ActionListener{
	private JButton start;//开始游戏按钮
	private JButton load;//读档按钮
	private JButton makeAbout;//制作相关
	private JButton quit;//退出
	private threadChange tc;
	private Vector<JLabel> texVc;
	private music musicPlayer;
	ImageIcon black_back = new ImageIcon("src/imageSource/黑色.jpg");
	ImageIcon topic_back = new ImageIcon("src/imageSource/黑布.jpg");
	JLabel black = new JLabel(black_back);//幕前黑布
	JLabel topic = new JLabel(topic_back);//剑落长风主题
	public GameStart(){
		texVc = new Vector<>();
		tc = new threadChange(2000);
        String text = readText.read("src/text/text.txt").get(0);
        for(int i = 0;i < text.length();i++){
        	JLabel jl = new JLabel(text.charAt(i) + "");
        	texVc.add(jl);
        }
        
        start = new JButton("新的旅程");
        load = new JButton("旧的回忆");
        makeAbout = new JButton("制作相关");
        quit = new JButton("退出游戏");
        
		setTitle("");  
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
		setVisible(true);
        //--------------------------------------------------------------------------
		musicPlayer = new music();//音乐播放
		printWord(jp);
		jp.setLayout(null);//必须设置在黑布背景设置之后，不然显示不出。
		setbtnInfo(jp);
	}
	
	public void printWord(JPanel jp){
		jp.add(black);
		jp.validate();
		tc.run(1500);
		for(int i = 0;i < texVc.size();i++){
			texVc.get(i).setFont(new Font(null, 0, 30));
			texVc.get(i).setForeground(Color.WHITE);
		}
		
		int count = 0;
		for(; count < 7;count++){
			texVc.get(count).setBounds(300 + count*50, 200, 50, 50);
			black.add(texVc.get(count));
			tc.run(300);
			jp.updateUI();
		}
		tc.run(800);
		int location = 0;
		for(;count < 10;count++){
			texVc.get(count).setBounds(300 + location*50, 250, 50, 50);
			black.add(texVc.get(count));
			tc.run(300);
			jp.updateUI();
			location++;
		}
		tc.run(800);
		for(;count < 13;count++){
			texVc.get(count).setBounds(350 + location*50, 250, 50, 50);
			black.add(texVc.get(count));
			tc.run(300);
			jp.updateUI();
			location++;
		}
        tc.run();
        black.setVisible(false);
        jp.add(topic);
        jp.validate(); 
	}

	private void setbtnInfo(JPanel jp){
		topic.add(start);
		topic.add(load);
		topic.add(makeAbout);
		topic.add(quit);
		start.setBounds(LenthAll.WINDOW_WIDTH / 2 - 50, 350, 100, 30);
		load.setBounds(LenthAll.WINDOW_WIDTH / 2 - 50, 400, 100, 30);
		makeAbout.setBounds(LenthAll.WINDOW_WIDTH / 2 - 50, 450, 100, 30);
		quit.setBounds(LenthAll.WINDOW_WIDTH / 2 - 50, 500, 100, 30);
		start.setVisible(true);
		load.setVisible(true);
		quit.setVisible(true);
		makeAbout.setVisible(true);
		setVisible(true);
		jp.validate();
		start.addActionListener(this);
		load.addActionListener(this);
		makeAbout.addActionListener(this);
		quit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("新的旅程")){
			setVisible(false);
			musicPlayer.Close();
			new newTrip();
		}
		else if(e.getActionCommand().equals("旧的回忆")){
			//序列化制作存档
		}
		else if(e.getActionCommand().equals("制作相关")){
			//
		}
		else if(e.getActionCommand().equals("退出游戏")){
			MyDialog.showMessageDialog("                                                   正在退出游戏................", "退出", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
			System.exit(-1);
		}
	}
}
