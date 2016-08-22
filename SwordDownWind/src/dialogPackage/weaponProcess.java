package dialogPackage;

import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import PersonAll.Hero;
import Weapon.Weapon;

public class weaponProcess extends JDialog{
	private Hero player;
	private HashMap<String, Weapon> weaponProcess;
	private Vector<JButton> buttonWeapon;
	private JPanel jp;
	public weaponProcess() {
		// TODO Auto-generated constructor stub
		player = new Hero();
		jp = (JPanel)getContentPane();
		jp.setLayout(new GridLayout(6, 6));
		weaponProcess = player.getWeapon();
		buttonWeapon = new Vector<>();
		setBounds(300, 200, 600, 400);
		for(Map.Entry<String, Weapon> entry:weaponProcess.entrySet() ){
			buttonWeapon.add(new JButton(entry.getKey()));
		}
		for(int i = 0; i < buttonWeapon.size();i++){
			jp.add(buttonWeapon.get(i));
		}
		//weapon package
		for(int i = 0;i < 36 - buttonWeapon.size();i++){
			JButton btnNULL = new JButton("Пе");
		    jp.add(btnNULL);
		}
		show();
	}
}
