
import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");

		int n = sc.nextInt();

/*		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= (i - 1); j++) {
				System.out.print(" ");
			}
			//for(int j = 1; j <= n+1-i ; j++){
			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// while문
		int i = 1, j;
		while (i <= n) {
			j = 1;
			while (j <= (i - 1)) {
				System.out.print(" ");
				j++;
			}
			j = n;
			while (j >= i) {
				System.out.print("* ");
				j--;
			}
			System.out.println();
			i++;
		}*/

		// do-while문

/*		int i = 1, j;
		do {
			j = 0;
			do {
				if( j != 0) {
					System.out.print(" ");
				}
				k++;
			} while (j <= (i - 1));
			j = n;
			do {
				System.out.print("* ");
				j--;
			} while (j >= i);
			System.out.println();
			i++;
		} while (i <= n);*/
		
		//4번
		
/*		for(int i = 1 ; i <= n; i++) {
			
			for(int j = 1 ; j <= (n-i) ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		//while 문
/*		int i = 1, j;
		while(i <= n) {
			j = 1;
			while(j <= (n-i)) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while(j <= i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		//do-while문
/*		int i = 1, j;
		do {
			j = 1;
			do {
				System.out.print(" ");
				j++;
			}while(j <= (n-i+1));
			j = 1;
			do {
				System.out.print("*");
				j++;
			}while(j <= i);
			System.out.println();
			i++;
			
		}while(i <= n);
		*/
		
		//3-2번
/*		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=n ; j++) {
				if(i <= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}*/
		//4-2번
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				if( i+j >= n+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		
		sc.close();

	}

}
