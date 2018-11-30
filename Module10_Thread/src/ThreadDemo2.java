
public class ThreadDemo2 extends Thread {
	
	public ThreadDemo2(String threadName) {
		super(threadName);
	}
	
	public void run() { // this method must be overrided
		for(int i = 0 ; i < 100 ; i++)
			System.out.println(getName() + " : Number " + i);
	}

	public static void main(String[] args) {
		
		ThreadDemo2 t1 = new ThreadDemo2("Thread 1");
		//t1.setName("Thread 1");
		t1.start(); // Thread should be started manually
/*		
		try {
			Thread.sleep(2);
		}catch(InterruptedException e) {
			
		}
*/		
		ThreadDemo2 t2 = new ThreadDemo2("Thread 2");
		//t2.setName("Thread 2");
		t2.start();
/*		
		try {
			Thread.sleep(2);
		}catch(InterruptedException e) {
			
		}
*/		
		ThreadDemo2 t3 = new ThreadDemo2("Thread 3");
		//t3.setName("Thread 3");
		t3.start();
		
	}

}
