//다시풀기
//35792입력을 29753으로
import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 :");
		int n = sc.nextInt();
		
		while (n > 0) {
			System.out.print(n % 10);	//값뽑기
			n = n / 10;	//값날리기
		}

	}

}
