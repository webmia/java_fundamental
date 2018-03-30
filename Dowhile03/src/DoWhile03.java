
//계절을 표시 월입력
import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month = 0;
		String retry = "";
		// String season = "";

		do {
			do {
				System.out.print("계절을 표시합니다 월 입력(1-12): ");
				month = sc.nextInt();
			} while (month < 1 || month > 12);
			switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println(month + "월은 봄입니다.");
				// season = "봄";
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month + "월은 여름입니다.");
				// season = "여름";
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "월은 가을입니다.");
				// season = "가을";
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(month + "월은 겨울입니다.");
				// season = "겨울";
				break;
			}
			/*
			 * if (month > 0 && month < 13) { System.out.println(month + " 월은 " + season +
			 * "입니다."); }
			 */
			System.out.print("한번더 하시겠습니까?(Y/N):");
			retry = sc.next();
			
			//equals() : 참조값이 같은 값이면 참
			//equalsIgnoreCase() : 문자열 길이부터 같은지 판별한 후 대소문자 구별없이 가능하게 해준다 
			//(길이부터 판별하기때문에 equals()보다 속도면에서 좋다(?))
		} while (retry.equalsIgnoreCase("y"));
		System.out.println("계절 판별 프로그램을 종료합니다.");
		sc.close();

	}

}
