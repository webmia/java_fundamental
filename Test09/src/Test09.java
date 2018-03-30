
//util package 안에 Scanner class import
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		/*
		 * Scanner class를 이용하기위해 참조변수 sc를 선언한 뒤 new Scanner()를 작성한다. 
		 * System.in : 입력 스트림 ; 키보드로부터 입력을 하겠다.
		 */
		Scanner sc = new Scanner(System.in);
		// System.out : 출력 스트림
		System.out.print("정수 입력 : ");
		// n에 int형 값을 입력하여 넣는다.
		int n = sc.nextInt();
		/*
		// 정수 입력 양수,음수 찾기
		if (n > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		} else if (n < 0) {
			System.out.println("입력하신 숫자는 음수입니다.");
		} else {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		*/

		// 정수 입력 홀짝
		if (n % 2 != 1) {
			if (n == 0) {
				System.out.println("0입니다.");
			} else {
				System.out.println( n + "은(는) 짝수입니다.");
			}
		} else {
			System.out.println(n + "은(는) 홀수입니다.");
		}

		// sc close()를 사용하여 메모리 누수 제거(?) / 입출력은 열면 닫아야함.
		sc.close();
	}
}
