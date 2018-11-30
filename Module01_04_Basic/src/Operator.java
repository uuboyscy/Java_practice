
public class Operator {
	
	public static void main(String[] args) {
	
		int a = 11 , b = 12 ,c = 13;
		System.out.printf("1%d%d%d\n",a,b,c);
		
		int x = 3 , y = 4 , z ;
		z = ++x * y;
		z = x++ * y;
		z = x+++y; // ++ ÄÝ©ó x
		z = x+(++y);
		System.out.println("x = " + x + " , y = " + y + " , z = " + z);
		
		
	} // main
} // class
