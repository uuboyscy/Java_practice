
public class ArrayLab {

	public static void main(String[] args) {
		
		int[][][] a = 	{
							{{1, 3}, {2, 5}}, 
							{{2, 6}, {3, 2}}, 
							{{1, 5}, {4, 3}}
						};
		
		int sum = 0 ;
		int sum2 = 0;

		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
				for(int k = 0 ; k < a[i][j].length ; k++) {
					sum += a[i][j][k];
				} // k
			} // j
		} // i
		System.out.println(sum);
		
		for(int[][] m : a)
			for(int[] n : m)
				for(int d : n) sum2 += d;
				
		
		System.out.println(sum2);
		
	} // main

}
