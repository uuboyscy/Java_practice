/*
 * 1.	��ƪ��m��-Power
�g�@���int power(int x, int n)�Ψӭp��x��n����C
�����Gpower(5,3)�Y�p��53�C
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
