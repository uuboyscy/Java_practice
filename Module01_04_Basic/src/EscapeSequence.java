
public class EscapeSequence {

	public static void main(String[] args) {

		System.out.print("123123123123\n");
		System.out.print("123123123123\r");
		System.out.print("123123\t1v2c1v21\tfd\tff\ts\t1\n");
		System.out.print("g3123\tz\tg\td\tg\tqqqqq\n");
		
		int[] x;
		int n = 5;
		x = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			x[i] = i;
			System.out.println("x[" + i + "] = " + x[i]);
		} // for i
		
		System.out.println(x.length);
		
		
		String dog = "dog";
		System.out.println(dog);
		System.out.println(dog.length());
		String[] tem = dog.split("");
		for(int i = 0 ; i < tem.length ; i++) {
			System.out.println(tem[i]);
		}
		
	} // main

} // class
