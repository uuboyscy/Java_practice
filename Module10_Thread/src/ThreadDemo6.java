
public class ThreadDemo6 extends Thread {
	
	public ThreadDemo6(String threadName) {
		super(threadName);
	}
	
	public void run() {
		for(int i = 0 ; i < 100 ; i++)
			System.out.println(getName() + " : Number " + i);
	}

	public static void main(String[] args) {
		
		new ThreadDemo6("Thread 1") {
			public void run() {
				for(int i = 0 ; i < 100 ; i++)
					System.out.println(getName() + " : Number " + i);
			} // anonymous class
		}.start(); // 此寫法適合只有一個方法需要覆寫，若有多個方法需要覆寫則不是合用此寫法

		new ThreadDemo6("Thread 2") {
			public void run() {
				for(int i = 0 ; i < 100 ; i++)
					System.out.println(getName() + " : Number " + i);
			}
		}.start();

		new ThreadDemo6("Thread 3") {
			public void run() {
				for(int i = 0 ; i < 100 ; i++)
					System.out.println(getName() + " : Number " + i);
			}
		}.start();
		
	}

}
