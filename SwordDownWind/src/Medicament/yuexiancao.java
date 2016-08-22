package Medicament;

public class yuexiancao extends addMPMedicament{
	private static int number = 0;
	@Override
	public int getMP() {
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
