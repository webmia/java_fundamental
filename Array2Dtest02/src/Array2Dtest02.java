import java.util.Scanner;
public class Array2Dtest02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행수 입력 : ");
		int h/*보통 행은 height - h */ = sc.nextInt();
		
		System.out.print("열수 입력 : ");
		int w/*보통 열은 width - w */ = sc.nextInt();
		
		int[][] a = new int[h][w];
		
		//초보자 구조 파악용
		for(int i=0; i<a.length; i++) {
		  for(int j=0; j<a[i].length; j++) {
			a[i][j] = (int)(Math.random()*90)+10; //10~99짜지의 두자리수 난수
		  }
		}
		for(int i=0; i<a.length; i++) {
		  for(int j=0; j<a[i].length; j++) {
			  System.out.printf("%3d",a[i][j]);
		  }
		  System.out.println();
		}
		
//변수 대입과 출력을 한번에 처리 
/*		for(int i=0; i<h; i++) {
		  for(int j=0; j<w; j++) {
			a[i][j] = (int)(Math.random()*90)+10; //10~99짜지의 두자리수 난수
			System.out.printf("%3d",a[i][j]);
		  }
		  System.out.println();
		}*/
		
		sc.close();
	}

}
