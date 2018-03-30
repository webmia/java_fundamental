import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();

/*		// for 문
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}

		// while 문

		int i = 1, j;

		while (i <= n) {
			j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

		// do-while문

		int i = 1, j;

		do {
			j = 1;
			do {
				System.out.print("*");
				j++;
			} while (j <= i);
			System.out.println();
			;
			i++;
		} while (i <= n);*/

		// 2-1번
/*		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
*/
		// while문
/*		int i = 1, j;
		while (i <= n) {
			j = n;
			while (j >= i) {
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}*/

		// do-while문
/*		int i = 1, j;
		do {
			j = n;

			do {
				System.out.print("*");
				j--;
			} while (j >= i);

			System.out.println();
			i++;
		} while (i <= n);*/

		
		//2-2번
/*		//int k = n;
		for(int i = 1 ; i <= n ; i++) {
			
			for (int j = 1; j <= n+1-i ; j++ ) {
				System.out.print("*");
				
			}
			//k--;
			System.out.println();
		}*/
		
		//2-3번
		for(int i = 1; i<=n; i++) {
			for(int j = i; j<=n ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
