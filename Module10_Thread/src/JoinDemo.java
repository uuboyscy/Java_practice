
public class JoinDemo {

	public static void main(String[] args) {
		
		RunnableDemo nt1 = new RunnableDemo("Thread 1");
		RunnableDemo nt2 = new RunnableDemo("Thread 2");
		
		System.out.println(Thread.currentThread().isAlive());
		
		System.out.println(nt1.getT().getName() + " : " + nt1.getT().isAlive());
		System.out.println(nt2.getT().getName() + " : " + nt2.getT().isAlive());
		
		try {
			nt1.getT().join();
			nt2.getT().join();
			// wait for thread nt1 and nt2 
		}catch(InterruptedException k) {}
		
		System.out.println(nt1.getT().getName() + " : " + nt1.getT().isAlive());
		System.out.println(nt2.getT().getName() + " : " + nt2.getT().isAlive());
		
	} // end of main

} // end of class
