
public class RunnableDemo implements Runnable {
	
	private Thread t;
	public RunnableDemo(String threadName) {
	t = new Thread(this, threadName);
	t.start();
	}		
	
	public Thread getT() {
		return t;
	}


	public void run() {
		for(int i = 0 ; i < 1000 ; i++)
			try {
				Thread.sleep(1);
			}catch(Exception d) {}
			//System.out.println(t.getName() + " : Number " + i);
			System.out.print("");
	}
	
	public static void main(String[] args) {
		
		new RunnableDemo("Thread 1")/*.t.start()*/;
		new RunnableDemo("Thread 2")/*.t.start()*/;
		
	} // end of main

} // end of class
