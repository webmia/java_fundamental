import java.util.Scanner;
public class Array01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int sum =0;
		System.out.print("1���л� ���� :");
		int s1 = sc.nextInt();
		sum += s1;
		System.out.println("1���л��� ������ "+ s1 + "�Դϴ�.");
		
		System.out.print("2���л����� : ");
		int s2 =sc.nextInt();
		sum += s2;
		System.out.println("2���л��� ������ "+ s2 + "�Դϴ�.");
		
		System.out.print("3���л����� : ");
		int s3 = sc.nextInt();
		sum += s3;
		System.out.println("3���л��� ������ "+ s3 + "�Դϴ�.");
		
		System.out.print("4���л����� : ");
		int s4 = sc.nextInt();
		sum += s4;
		System.out.println("4���л��� ������ "+ s4 + "�Դϴ�.");
		
		System.out.print("5���л����� : ");
		int s5 = sc.nextInt();
		sum += s5;
		System.out.println("5���л��� ������ "+ s5 + "�Դϴ�.");
		
		System.out.println("5���� �հ� : "+ sum);
		System.out.println("5���� ��� : "+ (double)sum/5);
		
		sc.close();
		
	}

}
