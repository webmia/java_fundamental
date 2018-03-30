import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("**** 정사각형 만드는 프로그램 ****");
		System.out.print("정수 입력:");
		int n = sc.nextInt();

		// 1번 for문
/*		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}*/

		// 2번 while문
/*		int i = 1, j;
		while (i <= n) {
			j = 1;
			
			while (j <= n) {
				System.out.print("* ");
				j++;
			}
			
			i++;
			System.out.println();
		}*/

		// 3번 do-while문
		int i = 1, j;
		do {
			j = 1;
			
			do {
				System.out.print("* ");
				j++;
			} while (j <= n);
			
			i++;
			System.out.println();

		} while (i <= n);

		sc.close();
	}

}
