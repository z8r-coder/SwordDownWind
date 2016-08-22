package Medicament;

public class Changlicao implements medicament{
	private static int number = 0;
	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return 400;
	}

	@Override
	public int getMP() {
		// TODO Auto-generated method stub
		return 240;
	}

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

}
