package Weapon;

public class Bahuangnulong implements Weapon{
	private static int LimitedDuration = 100;
	private static int nowDuration = 100;
	@Override
	public int hurtValue() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public void LowerDurable(int para) {
		// TODO Auto-generated method stub
		nowDuration = nowDuration - para;
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		nowDuration = LimitedDuration;
	}

}
