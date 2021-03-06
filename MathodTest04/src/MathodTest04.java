import java.util.Scanner;
public class MathodTest04 {
	
	//메서드 정의
	public static void drawStar(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print("* ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("********메소드로 나누어 별표 찍기**********");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		//방법1-메소드로 나누지 않았을때
		/*for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//방법2-메소드로 나누었을때
		for(int i=1; i<=n; i++) {
			drawStar(i);
			System.out.println();
		}
		
		sc.close();
	}

}
