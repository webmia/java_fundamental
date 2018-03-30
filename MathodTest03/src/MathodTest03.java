import java.util.Scanner;
public class MathodTest03 {
	
	//power메소드 정의
	public static double power(double a, int b) {
		
		//변수명은 아래와 같은 result로 줘도 상관 없음 
		double power = 1;
		
		//for문
		/*for(int i=0; i<b; i++) {
			power *= a;
		}
		return power;*/
		
		//while문
		/*int i = 0;
		while(i<b) {
			power *= a;
			i++;
		}
		return power;*/
		
		//do-while문
		int i = 0;
		do {
			power *= a;
			i++;
		}while(i<b);
		return power;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 입력 : ");
		double a = sc.nextDouble();
		System.out.print("정수 입력 : ");
		int b = sc.nextInt();
		
		//곱셈이니까 기본값 1
		/*double result = 1;
		for(int i=0; i<b; i++) {
			result *= a;
		}*/
		
		//power 메소드 호출
		double result = power(a,b);
		System.out.println(a + "의 " + b + "승은 " + result + "입니다.");
		
		sc.close();
	}

}
