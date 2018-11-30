/*
 * 4.	ㄧ计絤策-Prime
糶ㄧ计int prime (int n)ノㄓт材n借计
*/

/*class IsPrime {
	static boolean isPrime(int x) { // check if it is a prime number
		if(x == 2) {
			return true;
		}else {
			for(int i = 2 ; i <= (x/2) ; i++) {
				if(x%i == 0)return false;
			}
		return true;
		} //else

	} // end of method
} // class IsPrime
*/

public class Prime {
	
	static int prime(int n) {
		//IsPrime isPrime = new IsPrime();
		int result = 2;
		int count = 0;
		
		while(count < n) {
			if(IsPrime.isPrime(result) == true) count++;
			result++;
		}
		
		return result-1;
	}

	public static void main(String[] args) {
		
		System.out.println(prime(5));

	}

}
