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

public class Refund2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int shp = 132 ; // 應付金額
		int money = 0 ; // 實付金額
		
		int[] coinType = 	{1000,	500,	100,	50,	10,	5,	1}; // 貨幣類型
		int[] m = 			{0,		0,		0,		0,	0,	0, 	0}; // 找零之迴圈 & 數量
		
		System.out.printf("商品為%d元，請輸入欲付款金額。%n",shp);
		money = scanner.nextInt();
		
		if(money < shp) { // 金額不足
			System.out.println("金額不足。");
		}else if(money == shp) { // 不必找錢
			System.out.println("不必找錢。");
		}else { // 找零
			
			System.out.printf("買了%d元商品，付了%d元應找回:%n", shp, money);
			money -= shp; // 須找零金額
		
			for(int i = 0 ; i < 7 ; i++) {
				
				if(money >= coinType[i]) { // 各種貨幣之張數
					m[i] = money/coinType[i];
					money -= m[i] * coinType[i];
					System.out.printf("%d張%d元%n", m[i], coinType[i]);
				}
				
			} // for i in coin
		
		} // else
		
		scanner.close();
		
	} // main

} // class
