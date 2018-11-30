/*
 * 1.	函數的練習-Power
寫一函數int power(int x, int n)用來計算x的n次方。
說明：power(5,3)即計算53。
*/

public class Power {

	static void power(int x , int y) {
		int result = 1;
		for(int i = 0 ; i < y ; i++) result *= x;
		System.out.print(result);
	}
	
	public static void main(String[] args) {
		
		power(2,5);

	}

}
