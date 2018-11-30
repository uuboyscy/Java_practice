/*
 * 11.	�j��ԭz���m��-Interest
���르�H10%��Q���100000���A�q�Ӻ�h�H5%�ƧQ���100000���C�p��h�֦~��q�Ӻ⪺���i�H�W�L���르�A�ñN���ɨ�H���ƦL�X�C(27�~��)
*/

public class Interest {
 	
 	static double power(double x , double y) {
 		double result = 1;
 		for(int i = 1 ; i <= y ; i++)result *= x;
 		return result;
 	}
 	public static void main(String[] args) {
 		final int P = 100000;
 		double r1 = 0.1; // Qian Jin Da
 		double r2 = 0.05; // Hao Xi Suan
 		
 		int n = 0; // year
 		
 		while( (1+r1*n) >= power((1+r2) , n) ) {			
 			n++;
 		} // while
 		
 		System.out.printf("%d years later,\n",n);
 		System.out.printf("QianJinDa has $ %f\n",P*(1+r1*n));
 		System.out.printf("HaoXiSuan has $ %f\n",P*power((1+r2) , n));
 	} 
}  // end of class
