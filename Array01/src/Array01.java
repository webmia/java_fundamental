import java.util.Scanner;
public class Array01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int sum =0;
		System.out.print("1번학생 점수 :");
		int s1 = sc.nextInt();
		sum += s1;
		System.out.println("1번학생의 점수는 "+ s1 + "입니다.");
		
		System.out.print("2번학생점수 : ");
		int s2 =sc.nextInt();
		sum += s2;
		System.out.println("2번학생의 점수는 "+ s2 + "입니다.");
		
		System.out.print("3번학생점수 : ");
		int s3 = sc.nextInt();
		sum += s3;
		System.out.println("3번학생의 점수는 "+ s3 + "입니다.");
		
		System.out.print("4번학생점수 : ");
		int s4 = sc.nextInt();
		sum += s4;
		System.out.println("4번학생의 점수는 "+ s4 + "입니다.");
		
		System.out.print("5번학생점수 : ");
		int s5 = sc.nextInt();
		sum += s5;
		System.out.println("5번학생의 점수는 "+ s5 + "입니다.");
		
		System.out.println("5명의 합계 : "+ sum);
		System.out.println("5명의 평균 : "+ (double)sum/5);
		
		sc.close();
		
	}

}
