/*
 * 2.	��ƪ��m��-Sigma
�g�@���double my_fun (double x, int n)�p�U�G
 
���ܡG�Q�ΤW�D��power(x,n)�M�Ұ�W��factorial(n)�ӧ����C
*/

public class Sigma {
	
	static double my_fun (double x, int n) { // my_fun
		double pow = 1;
		for(int i = 0 ; i < n ; i++) pow *= x; // power x^n
		
		double fa = n;
		for(int j = n-1 ; j > 1 ; j--) fa *= j; //factorial n!
		
		double result = pow/fa;
		if(n > 1) result += my_fun(x, n-1);
		return result;
	} // my_fun
	
	public static void main(String[] args) {
		
		double w = my_fun(2, 4);
		System.out.println(w);
		
	}

}
