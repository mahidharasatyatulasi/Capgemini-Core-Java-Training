package lab8;

public class Exercise2 {
	public static void main(String[] args) {
		Runnable runnable=new Timer();
		Thread t1=new Thread(runnable,"Demo");
		t1.start();
	}
}
