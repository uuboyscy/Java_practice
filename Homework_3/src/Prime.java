/*
 * 4.	函數的練習-Prime
寫一函數int prime (int n)用來找出第n個質數。
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
