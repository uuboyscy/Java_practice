/*
 * 4.	迴圏的練習-Amstrong
Amstrong數是指一個三位數的整數，其各位數之立方和等於該數本身。
找出所有的Amstrong數。
說明：153=1^3+5^3+3^3，故153為Amstrong數。
*/

public class Amstrong {
	
	static int cubeSum(int x) { // return the cube sum of each element in the number x
		int i, j, k;
		i = x/100; // first
		x -= i*100; 
		j = x/10; // second
		x -= j*10;
		k = x; // third
		return i*i*i+j*j*j+k*k*k;
	}

	public static void main(String[] args) {
	
		for(int i = 100 ; i < 1000 ; i++) {
			
			if(i == cubeSum(i))System.out.print(cubeSum(i) + " ");
			
		}
		
		System.out.println("are Amstrong numbers.");
			
	}

}
