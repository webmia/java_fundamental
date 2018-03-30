import java.util.Scanner;

public class Test17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int n = sc.nextInt();
		
		//입력받은 수만큼 *를찍는다.
		//1번
		/*for(int i = 0 ; i < n ; i++ ) {
			System.out.print("*");
		}*/
		
		//2번
		//*+*+*+*+*+
		/*for(int i = 0 ; i < n ; i++) {
			if( i % 2 == 0) {
				System.out.print("*");
			}else {
				System.out.print("+");
			}
		}
		*/
		//3번
		//정수 입력  1+2+3+4+5=15
		/*int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + i ;
			System.out.print(i);
			if(i < n) {
				System.out.print("+");
			}
		}
		System.out.print("=" + sum);*/
		
		//4번
		//while문
		int sum = 0;
		int i = 1;		//초기값
		while(i <= n) {	//조건
			sum = sum + i;
			System.out.print(i);
			if(i<n) {
				System.out.print("+");
			}
			i++;		//증감값
		}
		System.out.print("=" + sum);
		
		
		
		
		sc.close();
		
	}
	
}
