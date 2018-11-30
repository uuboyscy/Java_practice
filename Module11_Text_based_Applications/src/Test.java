
public class Test {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		System.out.println("s1 " + s1);
		System.out.println("s2 " + s2);
		s2 = "123";
		System.out.println("s1 " + s1);
		System.out.println("s2 " + s2);
		while(true) s1 += 1;
		
	} // main

} // end of class
