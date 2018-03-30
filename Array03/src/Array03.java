import java.util.Scanner;
public class Array03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 성적 처리 프로그램(배열활용)");
		System.out.print("학생 수 입력 : ");
		int n = sc.nextInt();
		
		int[] st = new int[n];
		int sum = 0;
		
		for(int i=0; i<st.length; i++) {
			System.out.print((i+1) + "번째 학생의 점수 입력 :");
			st[i] = sc.nextInt();
			sum += st[i];
		}
		
		System.out.println();
		System.out.println(st.length + " 명의 점수 합 :" + sum);
		System.out.println(st.length + " 명의 점수 평균 :" + (double)sum/st.length);
		sc.close();
		
	}

}
