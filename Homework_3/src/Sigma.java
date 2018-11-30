/*
 * 2.	函數的練習-Sigma
寫一函數double my_fun (double x, int n)如下：
 
提示：利用上題的power(x,n)和課堂上的factorial(n)來完成。
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
