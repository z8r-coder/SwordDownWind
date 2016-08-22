package Medicament;

public class biyuehua extends addHPMedicament{
	private static int number = 0;
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return number;
	}

	@Override
	public void setCount(int para) {
		// TODO Auto-generated method stub
		number = para;
	}

	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return 240;
	}

}
