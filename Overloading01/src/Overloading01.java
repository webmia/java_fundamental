import java.util.Scanner;

public class Overloading01 {
	
	public static int max(int a, int b) {
		if(a > b) return a;
		else  return b;
	}
	
	public static int max(int a, int b, int c) {
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
	  return max;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1�� �Է� : ");
		int x = sc.nextInt();
		System.out.print("���� 2�� �Է� : ");
		int y = sc.nextInt();
		System.out.print("���� 3�� �Է� : ");
		int z = sc.nextInt();
		
		System.out.println("�ΰ��� ������ �ִ밪�� " + max(x,y) + "�Դϴ�.");
		System.out.println("������ ������ �ִ밪�� " + max(x,y,z) + "�Դϴ�.");
		
		sc.close();
		
	}

}
