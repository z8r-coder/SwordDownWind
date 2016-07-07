/*第六部分*/
package basePackage;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.naming.InitialContext;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PersonAll.yannanzheng;
import PersonAll.zhenghaotian;
import dialogPackage.fightDialog;
import warFrame.fightScence_1;

public class SecondSection extends JFrame{
	private threadChange tc;
	private Vector<JLabel> Tree;
	private Vector<JLabel> Land;
	private Vector<JLabel> Boss;
	private Vector<JLabel> Person;
	private int [][]matrix;
	private int Person_x;
	private int Person_y;
	public SecondSection() {
		// TODO Auto-generated constructor stub
		tc = new threadChange(100);
		Tree = new Vector<JLabel>();
		Land = new Vector<JLabel>();
		Boss = new Vector<JLabel>();
		Person = new Vector<JLabel>();
		matrix = new int[LenthAll.COUNT_ROW][LenthAll.COUNT_COL];
		matrix = readTxtFile.readFile("src/MapSource/liyunTown_forest.txt");
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
        //-----------------------------------窗口建立----------------------------------------------
        ImageIcon icon = new ImageIcon("src/imageSource/圆月.jpg");
        ImageIcon icon2 = new ImageIcon("src/imageSource/燕南征未受伤.jpg");
        ImageIcon icon3 = new ImageIcon("src/imageSource/郑浩天.jpeg");
        ImageIcon icon4 = new ImageIcon("src/imageSource/燕南征受伤.jpeg");
        JLabel jl = new JLabel(icon);//圆月
        JLabel jl_1 = new JLabel(icon2);//未受伤时的燕南征
        JLabel jl_2 = new JLabel(icon3);//郑浩天
        JLabel jl_3 = new JLabel(icon4);//受伤时的燕南征
        jp.add(jl);
        setVisible(true);
        MyDialog.showMessageDialog("  "+"                                     呲呲........呲呲.....", "月夜",LenthAll.TALK_DIALOG_WIDTH,LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("  "+"                                      这些年过得可好？郑师兄.", "月下男子", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        MyDialog.showMessageDialog("    何来好与不好,你知我生性循规蹈矩，跳不出那俗世之围，在这点\n  上我的确是不如你", "灵霄第一剑郑浩天", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jl.setVisible(false);
        jp.add(jl_2);
        jp.validate();
        MyDialog.showMessageDialog("  "+"         交代《无妄天书》的下落，我便与师傅说从未有过你们的下落\n  。", "郑浩天", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jl_2.setVisible(false);
        jp.add(jl_1);
        jp.validate();
        MyDialog.showMessageDialog("  "+ "哈哈，身在万丈红尘外，凡俗何事扰我心？十年前，我便告诉过你\n  们，我从未盗过《无妄天书》，只是受了高人指点，蒙人恩情，武\n  功才突飞猛进，绝非练会了《无妄天书》上  的武功", "燕南征", LenthAll.TALK_DIALOG_WIDTH, LenthAll.TALK_DIALOG_HEIGHT);
        jl_1.setVisible(false);
        jl_2.setVisible(true);
        jp.validate();
        MyDialog.showMessageDialog("  "+"							师弟，既然你执着于此，那便休怪我无情了。", "郑浩天", LenthAll.TALK_DIALOG_WIDTH,LenthAll.TALK_DIALOG_HEIGHT);
        jl_2.setVisible(false);
        init();
        paintMap(matrix, jp);
        jp.validate();
        
        this.addKeyListener(new KeyAdapter() {
        	public void keyPressed(KeyEvent e) {
				matrix = MoveLogic.moveStrategy(matrix, e.getKeyCode(), Person_x, Person_y);
				paintMap(matrix, jp);
				jp.updateUI();
				if(Person_x == 11 && Person_y == 25){
					dispose();
					new fightScence_1(new yannanzheng(), new zhenghaotian(),1);
				}
			}
		});
	}
	private void init() {
		ImageIcon tree = new ImageIcon("src/imageSource/森林.png");
		ImageIcon boss = new ImageIcon("src/imageSource/person.png");
		ImageIcon land = new ImageIcon("src/imageSource/草地.png");
		ImageIcon person = new ImageIcon("src/imageSource/燕南征行.jpg");
		for(int i = 0; i < LenthAll.COUNT_ROW;i++)
			for(int j = 0;j < LenthAll.COUNT_COL;j++){
				if(matrix[i][j] == MapDeploy.BOSS_ON){
					JLabel J_BOOS = new JLabel(boss);
					Boss.add(J_BOOS);
				}
				else if(matrix[i][j] == MapDeploy.TREE_ON){
					JLabel J_TREE = new JLabel(tree);
					Tree.add(J_TREE);
				}
				else if(matrix[i][j] == MapDeploy.PERSON_STAND){
					JLabel J_PERSON = new JLabel(person);
					Person.add(J_PERSON);
				}
				else if(matrix[i][j] == MapDeploy.GRASSLAND_ON){
					JLabel J_LAND = new JLabel(land);
					Land.add(J_LAND);
				}
			}
	}
	private void paintMap(int [][]matrix,JPanel jp){
		int count_tree = 0;
		int count_land = 0;
		for(int i = 0; i < LenthAll.COUNT_ROW;i++){
			for(int j = 0; j < LenthAll.COUNT_COL;j++){
				switch (matrix[i][j]) {
				case MapDeploy.BOSS_ON:
					Boss.get(0).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT,LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
	            	jp.add(Boss.get(0));
					break;
				case MapDeploy.GRASSLAND_ON:
					Land.get(count_land).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT,LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
	            	jp.add(Land.get(count_land++));
					break;
				case MapDeploy.TREE_ON:
					Tree.get(count_tree).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT,LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
	            	jp.add(Tree.get(count_tree++));
	            	break;
				case MapDeploy.PERSON_STAND:
					Person.get(0).setBounds(-10 + j*LenthAll.IMAGE_WIDTH, -10 + i*LenthAll.IMAGE_HEIGHT,LenthAll.IMAGE_WIDTH, LenthAll.IMAGE_HEIGHT);
	            	jp.add(Person.get(0));
	            	Person_x = i;
	            	Person_y = j;
					break;
				default:
					break;
				}
			}
		}
	}
}
