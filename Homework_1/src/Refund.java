/*
5.選擇性敘述的練習-Refund
輸入在某商店購物應付金額與實付金額。
實付金額小於應付金額，則印出”金額不足”。
實付金額等於應付金額，則印出”不必找錢”。
實付金額大於應付金額，則輸出找回金額最少的鈔票數和錢幣數。
假設幣值只有1000, 500, 100元紙鈔和50, 10, 5, 1元硬幣。
說明：若買了132元的商品，付1000元，應找回一張500元，三張100元，一個50元硬幣，一個10元硬幣，一個5元硬幣和三個1元硬幣。
*/

import java.util.Scanner;

public class Refund {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int shp = 132 ; // 應付金額
		int money = 0 ; // 實付金額
		int m1000 = 0 , m500 = 0 , m100 = 0 , m50 = 0 , m10 = 0 , m5 = 0 , m1 = 0;
		
		System.out.printf("商品為%d元，請輸入欲付款金額。%n",shp);
		money = scanner.nextInt();
		
		if(money < shp) { // 金額不足
			System.out.println("金額不足。");
		}else if(money == shp) { // 不必找錢
			System.out.println("不必找錢。");
		}else { // 找零
			
			System.out.printf("買了%d元商品，付了%d元，應找回", shp, money);
			money -= shp; // 須找零金額
			
			if(money >= 1000) { // 1000張數
				m1000 = money/1000;
				money -= (money/1000) * 1000;
				System.out.printf("%d張1000元，",m1000);
			}
			if(money >= 500) { // 500張數
				m500 = money/500;
				money -= (money/500) * 500;
				System.out.printf("%d張500元，",m500);
			}
			if(money >= 100) { // 100張數
				m100 = money/100;
				money -= (money/100) * 100;
				System.out.printf("%d張100元，",m100);
			}
			if(money >= 50) { // 50張數
				m50 = money/50;
				money -= (money/50) * 50;
				System.out.printf("%d枚50元，",m50);
			}
			if(money >= 10) { // 10張數
				m10 = money/10;
				money -= (money/10) * 10;
				System.out.printf("%d枚10元，",m10);
			}
			if(money >= 5) { // 5張數
				m5 = money/5;
				money -= (money/5) * 5;
				System.out.printf("%d枚5元，",m5);
			}
			m1 = money; // 1張數
			System.out.printf("%d枚1元",m1);
		}
		
		//System.out.printf("%d %d %d %d %d %d %d", m1000, m500, m100, m50, m10, m5, m1);
		
		scanner.close();
		
	} // main
	
} // class
