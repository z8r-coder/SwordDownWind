package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.text.AbstractDocument.BranchElement;

import PersonAll.Hero;

public class SaveAndLoad {
	private Hero player;
	
	public SaveAndLoad(Hero player) {
		// TODO Auto-generated constructor stub
		this.player = player;
	}
	
	public void save(String MapName,int Person_x,int Person_y){
		player.setX(Person_x);
		player.setY(Person_y);
		player.setMapName(MapName);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/MapSource/player.txt"));
			oos.writeObject(player);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Hero load(){
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("src/MapSource/player.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Hero p = null;
		try {
			p = (Hero)ois.readObject();
			ois.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p ;
	}
}
