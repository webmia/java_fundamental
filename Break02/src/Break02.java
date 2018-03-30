//점수입력  0입력하면 종료
//입력한 값의 합계 :
import java.util.Scanner;

public class Break02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(;;) {
			System.out.print("점수입력(0입력하면 종료):");
			int scr = sc.nextInt();
			
			if (scr == 0) {
				//0일때 빠져나옴
				break;
			}
			
			sum += scr;
		}
		//무한루프
		/* for(;;)
		 * while(true) : 권장
		 * do{}(while(true);*/

		System.out.println("입력한 값의 합계:" + sum);
		sc.close();

	}

}
