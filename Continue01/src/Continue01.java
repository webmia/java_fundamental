//
public class Continue01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i == 7) {
				//continue : 반복문의 끝으로 이동, 실행문의 생략(제거)에 사용됨.
				continue;
			}

			System.out.println(i);

		}

	}

}
