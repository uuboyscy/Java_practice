/*
5.��ܩʱԭz���m��-Refund
��J�b�Y�ө��ʪ����I���B�P��I���B�C
��I���B�p�����I���B�A�h�L�X�����B�������C
��I���B�������I���B�A�h�L�X������������C
��I���B�j�����I���B�A�h��X��^���B�̤֪��r���ƩM�����ơC
���]���ȥu��1000, 500, 100���ȶr�M50, 10, 5, 1���w���C
�����G�Y�R�F132�����ӫ~�A�I1000���A����^�@�i500���A�T�i100���A�@��50���w���A�@��10���w���A�@��5���w���M�T��1���w���C
*/

import java.util.Scanner;

public class Refund2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int shp = 132 ; // ���I���B
		int money = 0 ; // ��I���B
		
		int[] coinType = 	{1000,	500,	100,	50,	10,	5,	1}; // �f������
		int[] m = 			{0,		0,		0,		0,	0,	0, 	0}; // ��s���j�� & �ƶq
		
		System.out.printf("�ӫ~��%d���A�п�J���I�ڪ��B�C%n",shp);
		money = scanner.nextInt();
		
		if(money < shp) { // ���B����
			System.out.println("���B�����C");
		}else if(money == shp) { // �������
			System.out.println("��������C");
		}else { // ��s
			
			System.out.printf("�R�F%d���ӫ~�A�I�F%d������^:%n", shp, money);
			money -= shp; // ����s���B
		
			for(int i = 0 ; i < 7 ; i++) {
				
				if(money >= coinType[i]) { // �U�سf�����i��
					m[i] = money/coinType[i];
					money -= m[i] * coinType[i];
					System.out.printf("%d�i%d��%n", m[i], coinType[i]);
				}
				
			} // for i in coin
		
		} // else
		
		scanner.close();
		
	} // main

} // class
