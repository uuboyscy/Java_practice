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

public class Refund {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int shp = 132 ; // ���I���B
		int money = 0 ; // ��I���B
		int m1000 = 0 , m500 = 0 , m100 = 0 , m50 = 0 , m10 = 0 , m5 = 0 , m1 = 0;
		
		System.out.printf("�ӫ~��%d���A�п�J���I�ڪ��B�C%n",shp);
		money = scanner.nextInt();
		
		if(money < shp) { // ���B����
			System.out.println("���B�����C");
		}else if(money == shp) { // �������
			System.out.println("��������C");
		}else { // ��s
			
			System.out.printf("�R�F%d���ӫ~�A�I�F%d���A����^", shp, money);
			money -= shp; // ����s���B
			
			if(money >= 1000) { // 1000�i��
				m1000 = money/1000;
				money -= (money/1000) * 1000;
				System.out.printf("%d�i1000���A",m1000);
			}
			if(money >= 500) { // 500�i��
				m500 = money/500;
				money -= (money/500) * 500;
				System.out.printf("%d�i500���A",m500);
			}
			if(money >= 100) { // 100�i��
				m100 = money/100;
				money -= (money/100) * 100;
				System.out.printf("%d�i100���A",m100);
			}
			if(money >= 50) { // 50�i��
				m50 = money/50;
				money -= (money/50) * 50;
				System.out.printf("%d�T50���A",m50);
			}
			if(money >= 10) { // 10�i��
				m10 = money/10;
				money -= (money/10) * 10;
				System.out.printf("%d�T10���A",m10);
			}
			if(money >= 5) { // 5�i��
				m5 = money/5;
				money -= (money/5) * 5;
				System.out.printf("%d�T5���A",m5);
			}
			m1 = money; // 1�i��
			System.out.printf("%d�T1��",m1);
		}
		
		//System.out.printf("%d %d %d %d %d %d %d", m1000, m500, m100, m50, m10, m5, m1);
		
		scanner.close();
		
	} // main
	
} // class
