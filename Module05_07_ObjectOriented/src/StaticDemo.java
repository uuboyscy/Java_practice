
public class StaticDemo {

	int x;
	static int y;
	int num;
	static int count;
	static {count = 10;}
	
	public static void main(String[] args) {
		
		//x++; // object dose not exist
		StaticDemo sd = new StaticDemo();
		sd.x++;
		
		y++;
		
		//sd.y++;// this syntax is not proper 
		
		System.out.println(count);
		
		int[] a = new int[3];
		
		try {
			for(int i = 0 ; i < 4 ; i++) {
				a[i] = i;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of range.");
		}
		
		int x = In.putint("123123132");
		System.out.println(x);
		
		
	} // end of main

}
