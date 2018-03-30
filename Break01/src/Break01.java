
public class Break01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				// break : switch문과 반복문만 빠져나올 수 있음
				break;
			}
			System.out.println(i);
		}

	}

}
