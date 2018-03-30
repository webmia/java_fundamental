import java.util.*;

public class MethodTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 삼각형
		System.out.println("*** 메소드로 나누어 별표 찍기 ***");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();

		// 방법1 - 메소드로 나누지 않았을때
/*		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		// 방법2 - 메소드로 나누었을 때 
		for(int i = 1 ; i <= n ; i++) {
			drawStar2(n, i);
		}
		
		
		sc.close();
	}
	
	// 메소드 정의
	public static void drawStar(int i) {
		for (int j = 1 ; j <= i ;j++ ) {
			System.out.print("* ");
		}
		System.out.println();
	}
	//do while 문 
	public static void drawStar1(int i) {
		int j = 1;
		do {
			System.out.print("* ");
			j++;
		}while(j <= i );
		System.out.println();
	}
	// 공백찍고 별표(역삼각)
	public static void drawStar2(int n, int i) {

		for(int j = n ; j >= i ;j--) {
			System.out.print("* ");
		}
		for(int j = 1 ; j < i ;j++) {
			System.out.print("  ");
		}
		System.out.println();
	}

}
