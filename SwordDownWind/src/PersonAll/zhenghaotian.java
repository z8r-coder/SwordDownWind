package PersonAll;

import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Skill.SkillAll;
import Skill.ziqidonglai;

public class zhenghaotian implements PersonAll{
	private static int HP;
	private static int MP;
	private static int baseAttack;
	private static int adderAttack;
	private static String name;
	private static int priority;
	private static Vector<SkillAll> prosseSkill;//持有技能
	public zhenghaotian(){
		prosseSkill = new Vector<>();
		HP = 5000;
		MP = 5000;
		baseAttack = 300;
		name = "郑浩天";
		priority = 500;
		ziqidonglai zqdl = new ziqidonglai();
		prosseSkill.add(zqdl);
	}
	
	public int getHP() {
		return HP;
	}
	
	public int getMP(){
		return MP;
	}

	@Override
	public void subHP(int paraHP) {
		// TODO Auto-generated method stub
		HP -= paraHP;
	}

	@Override
	public void subMP(int paraMP) {
		// TODO Auto-generated method stub
		MP -= paraMP;
	}

	@Override
	public void adderAttack(int paraAdderAttack) {
		// TODO Auto-generated method stub
		adderAttack = baseAttack + paraAdderAttack;
	}

	@Override
	public int getAdderAttack() {
		// TODO Auto-generated method stub
		return adderAttack;
	}

	@Override
	public void addHP(int paraHP) {
		// TODO Auto-generated method stub
		HP += paraHP;
	}

	@Override
	public void addMP(int paraMP) {
		// TODO Auto-generated method stub
		MP += paraMP;
	}
	public String getname() {
		return name;
	}
	public int getnowHP() {
		return HP;
	}
	public int getnowMP(){
		return MP;
	}
	public JLabel getHeadPhoto() {
		ImageIcon icon = new ImageIcon("src/imageSource/郑浩天人物.jpeg");
		JLabel jl_head = new JLabel(icon);
		return jl_head;
	}
	@Override
	public int getBaseAttack() {
		// TODO Auto-generated method stub
		return baseAttack;
	}
	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return priority;
	}
	public int probablity() {//施展技能的概率，与燕南天第二次攻击，百分之百使用该技能
		return -1;
	}
	public Vector<SkillAll> getSkillAll() {
		return prosseSkill;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addEX(int paraEX) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getUpEx() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setUpEx(int paraEx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLevel(int paraLevel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEx(int paraEx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPriority(int para) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNowHP(int paraHP) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNowMP(int paraMP) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SkillPointPlus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SkillPointSub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSkillPoint() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMoney() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addMoney(int paraMoney) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subMoney(int paraMoney) {
		// TODO Auto-generated method stub
		
	}
}
