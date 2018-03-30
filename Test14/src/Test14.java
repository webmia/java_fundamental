//2개 정수입력  항상 a 에는 작은수가 들어감 b에는 큰수가 들어감. swap기능 추가
import java.util.Scanner;
public class Test14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 1: ");
		int a = sc.nextInt();
		System.out.print("정수입력 2: ");
		int b = sc.nextInt();
		
		//더미 만들지 말자.
		//swap
		if ( a > b ) {
			int t = b;
			b = a;
			a = t;
		}
		
		System.out.println("a = " + a + ", b = " + b);
		sc.close();
	}
}
