
public class StringThread extends Thread {

	String s = "hello";
	
	public StringThread(){}
	
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + s);
			s += 1;
		}
	}
	
	
	public static void main(String[] args) {
		
		while(true)
			new StringThread().start();

	}

}
