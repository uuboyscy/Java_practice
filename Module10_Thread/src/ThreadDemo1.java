
public class ThreadDemo1 extends Thread {
	
	public void run() { // this method must be overrided
		for(int i = 0 ; i < 100 ; i++)
			System.out.println(getName() + " : Number " + i);
	}

	public static void main(String[] args) {
		
		ThreadDemo1 t1 = new ThreadDemo1();
		t1.setName("Thread 1");
		t1.start(); // Thread should be started manually
/*		
		try {
			Thread.sleep(2);
		}catch(InterruptedException e) {
			
		}
*/		
		ThreadDemo1 t2 = new ThreadDemo1();
		t2.setName("Thread 2");
		t2.start();
/*		
		try {
			Thread.sleep(2);
		}catch(InterruptedException e) {
			
		}
*/		
		ThreadDemo1 t3 = new ThreadDemo1();
		t3.setName("Thread 3");
		t3.start();
		
	}

}
