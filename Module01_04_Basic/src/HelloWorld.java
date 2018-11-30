
public class HelloWorld {
	
	static void method(int x, int y) {
		System.out.println("Hello");
		System.out.println(x + y);
	}// method
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		method(2, 3);
		
		int a = 1;
		float b = 4.123123123f;
		double c = 3.121212312313;
		String k = "123";
		
		System.out.println("string" + k);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(b/d);

		
	}// public static void main

}// public class HelloWorld
