
public class Gugudan01 {

	public static void main(String[] args) {

		// 1번 for문 활용
		/*for (int i = 2; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println();

		}*/

		// 2번 while문 활용
		/*int i = 2;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}
			System.out.println();
			i++;
		}*/

		// 3번 do-while문 활용
		int i = 2;
		do {
			int j = 1;
			do {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		} while (i <= 9);

	}

}
