import java.util.Scanner;
public class MathodTest03 {
	
	//power�޼ҵ� ����
	public static double power(double a, int b) {
		
		//�������� �Ʒ��� ���� result�� �൵ ��� ���� 
		double power = 1;
		
		//for��
		/*for(int i=0; i<b; i++) {
			power *= a;
		}
		return power;*/
		
		//while��
		/*int i = 0;
		while(i<b) {
			power *= a;
			i++;
		}
		return power;*/
		
		//do-while��
		int i = 0;
		do {
			power *= a;
			i++;
		}while(i<b);
		return power;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ǽ� �Է� : ");
		double a = sc.nextDouble();
		System.out.print("���� �Է� : ");
		int b = sc.nextInt();
		
		//�����̴ϱ� �⺻�� 1
		/*double result = 1;
		for(int i=0; i<b; i++) {
			result *= a;
		}*/
		
		//power �޼ҵ� ȣ��
		double result = power(a,b);
		System.out.println(a + "�� " + b + "���� " + result + "�Դϴ�.");
		
		sc.close();
	}

}
