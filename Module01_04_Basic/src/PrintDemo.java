
public class PrintDemo {

	public static void main(String[] args) {

		System.out.printf("/%5d/%n",123); // �@5��A����ɪť�
		System.out.printf("/%1d/%n",123); //�֩�ƭȤ���ƫh�������
		System.out.printf("/%+5d/%n",123); // �O�_��+��
		System.out.printf("/%X/%n",123); // �j�p�g�v�T���G���j�p�g
		System.out.printf("/%#X/%n",123);
		System.out.printf("/%f/%n",12345.678);
		System.out.printf("/%10.2f/%n",12345.678);
		System.out.printf("/%-10.1f/%n",12345.678);
		System.out.printf("/%010.2f/%n",12345.678);
		System.out.printf("/%10.2E/%n",12345.678);
		System.out.printf("/%,10.2f/%n",12345.678); // �N��������T��j�}
		System.out.printf("/%(10.1f/%n",-12345.678); // �H�A���N���t��
		System.out.printf("/%10s/%n","student");
		
	}

}
