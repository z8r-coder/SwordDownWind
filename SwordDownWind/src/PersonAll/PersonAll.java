package PersonAll;

import java.util.HashMap;
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
	String getname();
	JLabel getHeadPhoto();
	Vector<SkillAll> getSkillAll();
	int probablity();
}
