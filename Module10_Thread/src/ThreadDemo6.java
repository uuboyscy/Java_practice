
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
		}.start(); // ���g�k�A�X�u���@�Ӥ�k�ݭn�мg�A�Y���h�Ӥ�k�ݭn�мg�h���O�X�Φ��g�k

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
