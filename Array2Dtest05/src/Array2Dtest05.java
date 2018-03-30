import java.util.Scanner;

public class Array2Dtest05 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int[][] a = new int[n][n];
		
		//2차원 배열에 값을 대입하는 부분
		int k=1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = k++;
			}
		}
		
		//2차원 배열을 출력하는 부분
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		sc.close();
		
	}
}
