import java.util.*;

//1~45 6개 로또 랜덤 뽑은뒤 정수 입력 하여 확인
public class LottoTest01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("*** 로또 프로그램 ***");

		// 로또 생성
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;		//1~45 사이의 난수 생성
			//비교
			for(int j = 0 ; j < i ; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		//버블 정렬 후
		for(int i = 0; i<lotto.length-1;i++) {
			boolean checked = false;
			for(int j = 0 ; j < lotto.length-1-i; j++) {
				if(lotto[j]>lotto[j+1]) {
					int t = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = t;
					checked = true;
				}
			}
			if(!checked) {
				break;
			}
		}
		
		// 로또번호
		System.out.print("로또 번호: [");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.print("]");
		System.out.println();

		// 유저 로또 번호 입력
		int[] user = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			System.out.print((i + 1) + "번째 행운의 수 입력(1~45):");
			user[i] = sc.nextInt();
		}
		System.out.println();
		/*
		//유저 버블 정렬
		for(int i = 0; i<user.length-1;i++) {
			boolean checked = false;
			for(int j = 0 ; j < lotto.length-1-i; j++) {
				if(lotto[j]>lotto[j+1]) {
					int t = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = t;
					checked = true;
				}
			}
			if(!checked) {
				break;
			}
		}
		*/
		// 로또 번호와 유저 로또 번호와 비교
		int count =0;
		for (int i = 0; i < lotto.length; i++) {
			/*for(int j = 0; j < lotto.length;j++){
			 * if(lotto[i] == user [j]) {
			 *		System.out.print("체크");
			 * }
			 * }
			 * 
			 * */
			if (lotto[i] != user[i]) {
				System.out.println("꽝 다음기회에");
				break;
			}else {
				count++;
				if(count == 6) {
					 System.out.println("대박입니다.");
				}
			}
		}

		// 유저 로또 번호
		System.out.print("유저 로또번호 : [");
		for (int i = 0; i < 6; i++) {
			System.out.print(user[i] + " ");
		}
		System.out.print("]");
		System.out.println();

		// 로또번호
		System.out.print("로또 번호: [");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.print("]");
		sc.close();
	}

}
