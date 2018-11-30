
public class ThreadDemo5 extends Thread {
	
	public ThreadDemo5(String threadName) {
		super(threadName);
	}
	
	public void run() {
		for(int i = 0 ; i < 100 ; i++)
			System.out.println(getName() + " : Number " + i);
	}

	public static void main(String[] args) {
		
		ThreadDemo5 t1 = new ThreadDemo5("Thread 1") {
			public void run() {
				for(int i = 0 ; i < 100 ; i++)
					System.out.println(getName() + " : Number " + i);
			} // anonymous class
		}; // 此寫法適合只有一個方法需要覆寫，若有多個方法需要覆寫則不是合用此寫法
		t1.start();

		ThreadDemo5 t2 = new ThreadDemo5("Thread 2") {
			public void run() {
				for(int i = 0 ; i < 100 ; i++)
					System.out.println(getName() + " : Number " + i);
			}
		};
		t2.start();

		ThreadDemo5 t3 = new ThreadDemo5("Thread 3") {
			public void run() {
				for(int i = 0 ; i < 100 ; i++)
					System.out.println(getName() + " : Number " + i);
			}
		};
		t3.start();
		
	}

}
