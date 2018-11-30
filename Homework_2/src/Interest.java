/*
 * 11.	迴圈敘述的練習-Interest
錢精打以10%單利投資100000元，郝細算則以5%複利投資100000元。計算多少年後郝細算的投資可以超過錢精打，並將此時兩人錢數印出。(27年後)
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
