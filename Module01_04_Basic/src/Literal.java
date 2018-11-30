
public class Literal {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(n);
		n = 0144;
		System.out.println(n);
		
		Integer intObject = Integer.valueOf(1);
		String s = String.format("0x%08x", intObject);
		System.out.println(s);
		
		char w1 = 65, w2 = 'b';
		System.out.println(w1 + w2);
		
		
	}

}
