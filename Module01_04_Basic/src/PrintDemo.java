
public class PrintDemo {

	public static void main(String[] args) {

		System.out.printf("/%5d/%n",123); // 共5位，左邊補空白
		System.out.printf("/%1d/%n",123); //少於數值之位數則維持原樣
		System.out.printf("/%+5d/%n",123); // 是否有+號
		System.out.printf("/%X/%n",123); // 大小寫影響結果之大小寫
		System.out.printf("/%#X/%n",123);
		System.out.printf("/%f/%n",12345.678);
		System.out.printf("/%10.2f/%n",12345.678);
		System.out.printf("/%-10.1f/%n",12345.678);
		System.out.printf("/%010.2f/%n",12345.678);
		System.out.printf("/%10.2E/%n",12345.678);
		System.out.printf("/%,10.2f/%n",12345.678); // 將整束部分三位隔開
		System.out.printf("/%(10.1f/%n",-12345.678); // 以括號代替負數
		System.out.printf("/%10s/%n","student");
		
	}

}
