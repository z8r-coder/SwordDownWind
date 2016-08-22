package Medicament;

public class jinchuanggao extends addHPMedicament{	//½ð´¯¸à
	private static int number = 0;//the number of the good
	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return 50;
	}

	public void setCount(int temp){
		number = temp;
	}
	
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return number;
	}

}
