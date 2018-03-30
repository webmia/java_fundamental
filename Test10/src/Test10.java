
//4계절 월을 입력하세요? 겨울입디다. 345 봄 678 여름 91011가을 1212겨울
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하세요(1~12):");
		int month = sc.nextInt();


		// 조건식을 최소한 줄여서 쓰자.
		//2번 케이스
		if ((month >= 3) && (month <= 5)) {
			System.out.println("봄 입니다.");
		} else if ((month >= 6) && (month <= 8)) {
			System.out.println("여름 입니다.");
		} else if ((month >= 9) && (month <= 11)) {
			System.out.println("가을 입니다.");
		} else {
			if (month <= 0) {
				System.out.println("잘못입력하셨습니다.");
			} else {
				System.out.println("겨울 입니다.");
			}
		}

		//3번 케이스
		switch (month) {

		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;

		default:
			System.out.println("잘못입력");
		}

	}

}
