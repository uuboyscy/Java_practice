
public class Greeting2 {
	
	String[] greeting = {"Hello", "Hi", "Good"};
	
	public void printGreeting(int i)  
	//throws ArrayIndexOutOfBoundsException {
	throws Exception{
		System.out.println(greeting[i]);
	}
	
	

	public static void main(String[] args) {
		
		Greeting2 g = new Greeting2();
		int x;
		
		try {
			for(int i = 0 ; i <= g.greeting.length ; i++) {
				g.printGreeting(i);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Array Index Out Of Bounds");
		}catch(Exception e) {
			System.err.println("Exception Error");
		}finally {
			System.out.println("Always printed.");
		}
						
		try {
			x = In.putint("Enter a INT.");
			System.out.println(x);
		}catch(Exception e) {
			System.err.println("error");
			x = 0;
		}
		
		System.out.println(x);
		
		System.out.println("end");

	} // end of main

}
