package PersonAll;

import java.util.Vector;

import javax.swing.JLabel;

import Skill.SkillAll;

public interface PersonAll {
	void subHP(int paraHP);
	void subMP(int paraMP);
	void adderAttack(int paraAdderAttack);
	int getAdderAttack();
	void addHP(int paraHP);
	void addMP(int paraMP);
	int getnowHP();
	int getnowMP();
	int getBaseAttack();
	int getPriority();
	void setPriority(int para);
	String getname();
	JLabel getHeadPhoto();
	Vector<SkillAll> getSkillAll();
	int probablity();
	int getLevel();
	void setLevel(int paraLevel);
	int getEX();
	void addEX(int paraEX);
	void setEx(int paraEx);
	int getUpEx();
	void setUpEx(int paraEx);
	void setNowHP(int paraHP);
	void setNowMP(int paraMP);
	void SkillPointPlus();
	void SkillPointSub();
	int getSkillPoint();
	int getMoney();
	void addMoney(int paraMoney);
	void subMoney(int paraMoney);
}
