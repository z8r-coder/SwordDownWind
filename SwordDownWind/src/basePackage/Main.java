package basePackage;
import java.awt.KeyEventPostProcessor;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import PersonAll.Hero;
import PersonAll.yannanzheng;
import PersonAll.zhenghaotian;
import dialogPackage.fightDialog;
import warFrame.fightScence_1;

public class main {
	private KeyEvent e;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//liyunMap lym = new liyunMap();
		//JusticAndDamon jad = new JusticAndDamon();
		//Prologue pl = new Prologue();
		//FirstSection fs = new FirstSection();
		//liyunTown lt = new liyunTown();
		new SecondSection();
		//new fightScence_1(new yannanzheng(), new zhenghaotian());
	}
}