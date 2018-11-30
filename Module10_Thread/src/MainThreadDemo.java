
public class MainThreadDemo {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread(); // proof of the existance of Thread
		System.out.println("before change " + t.getName());
		t.setName("Main Thread");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("after change " + t.getName());
		t.run();
		System.out.println(t.isAlive());
		
	} // end of main

} // end of class
