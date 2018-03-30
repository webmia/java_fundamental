import java.util.Scanner;

public class Array2DTest06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****운수 판별 프로그램******");
		
		int[][] a = new int[4][5];
		String retry=null;
		
		do {
			System.out.print("행운의 수를 입력하세요(1~45) : ");
			int n = sc.nextInt();
			
			//2차원 배열의 난수 생성해서 대입 및 출력
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					a[i][j]=(int)(Math.random()*45)+1;
					
				}
				
			}
			
			//2차원 배열 출력,행운의 수와 2차원 배열의 값(난수)을 비교
			int count=0;
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					if (a[i][j]==n) {
						++count;
						System.out.printf(" *%2d*",a[i][j]);
						//System.err.printf("%3d",a[i][j]);
		//에러 찍을때 err사용/ 빨간 글씨로 나옴 / 출력하는 속도가 out이랑 달라서 줄이 잘 안맞을 수도 있음
					}else{
						System.out.printf("%3d",a[i][j]);
					}
					
				}
				System.out.println();
			}
			
			switch(count) {
			case 0:
				System.out.println("보통날입니다.");
				break;
			case 1:
				System.out.println("괜찮은 날입니다.");
				break;
			case 2:
				System.out.println("운이 좋은 날입니다.");
				break;
			case 3:
				System.out.println("운수대통인 날입니다.");
				break;
			case 4:
				System.out.println("대박인 날입니다.");
				break;
			default:
				System.out.println("울트라 짱 대박인 날 입니다.");
			
			}
			System.out.println("맞추신 갯수는" + count + "입니다.");
			System.out.println();
			
			System.out.print("다시 한번 시도하시겠습니까? (Y/N)");
			retry = sc.next();
		}while(retry.equalsIgnoreCase("y"));
		
		sc.close();
	}

}
