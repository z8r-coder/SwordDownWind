package Medicament;

public abstract class addHPMedicament implements medicament{		//分别用加HP和加MP的抽象类将其分层，可以让红药和蓝药不必全部实现接口中的内容。缺省适配
	abstract public int getHP();
	public int getMP(){
		return 0;
	}
}
