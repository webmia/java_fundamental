import java.util.Scanner;
public class MathodTest06 {
	
	public static void drawChars(char c,int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(c);
		}
			
			
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 입력받은 문자출력 **");
		System.out.print("문자입력 : ");
		char c = sc.next().charAt(0);
		
		System.out.print("갯수입력 : ");
		int n = sc.nextInt();
		
		System.out.println("문자찍기 시작합니다.");
		for(int i=1; i<=n; i++) {
			drawChars(' ', i-1);
			drawChars(c,n-i+1);
			System.out.println();
		}
		System.out.println("문자찍기 끝났습니다.");
		
		sc.close();
		
	}

}
