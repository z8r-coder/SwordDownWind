package basePackage;

public class threadChange extends Thread{
	private int time;
	
	public threadChange (int time) {
		this.time = time;
	}
	public void run() {
		try {
			sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run(int time) {
		try {
			sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
