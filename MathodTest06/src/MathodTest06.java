import java.util.Scanner;
public class MathodTest06 {
	
	public static void drawChars(char c,int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(c);
		}
			
			
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** �Է¹��� ������� **");
		System.out.print("�����Է� : ");
		char c = sc.next().charAt(0);
		
		System.out.print("�����Է� : ");
		int n = sc.nextInt();
		
		System.out.println("������� �����մϴ�.");
		for(int i=1; i<=n; i++) {
			drawChars(' ', i-1);
			drawChars(c,n-i+1);
			System.out.println();
		}
		System.out.println("������� �������ϴ�.");
		
		sc.close();
		
	}

}
