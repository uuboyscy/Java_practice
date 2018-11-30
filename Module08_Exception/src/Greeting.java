
public class Greeting {

	public static void main(String[] args) {
		
		String[] greeting = {"Hello", "Hi", "Good"};
		int x;
		
		try {
			for(int i = 0 ; i <= greeting.length ; i++) {
				System.out.println(greeting[i]);
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
