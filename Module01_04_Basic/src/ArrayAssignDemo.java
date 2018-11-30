
public class ArrayAssignDemo {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3};
		System.out.println(a[0]);
		
		int b[] = {1, 2, 3};
		System.out.println(b[0]);
		
		int[] c = new int[5];
		//c = {1, 2, 3, 4, 5};
		System.out.println(c.length);
		for(int i = 0 ; i < c.length ; i++) c[i] = i;
		
		for(int j = 0 ; j < c.length ; j++) System.out.println(c[j]);
		
		

	}

}
