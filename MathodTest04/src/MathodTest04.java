import java.util.Scanner;
public class MathodTest04 {
	
	//�޼��� ����
	public static void drawStar(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print("* ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("********�޼ҵ�� ������ ��ǥ ���**********");
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		//���1-�޼ҵ�� ������ �ʾ�����
		/*for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//���2-�޼ҵ�� ����������
		for(int i=1; i<=n; i++) {
			drawStar(i);
			System.out.println();
		}
		
		sc.close();
	}

}
