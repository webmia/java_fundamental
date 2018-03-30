//자주색 : 예약어 (이미 정해저있는 것)
public class Test03 {

	public static void main(String[] args) {
		
		double a = 2.5;	// double(8byte) 데이터 타입: 실수형 <-
		double b = 3.2;
		char ch = 'A' + 1;
		String str = "SW아키텍처 자바 빅데이터 개발자 과정";
		
		//(int): int형으로 casting(형변환)
		System.out.println("a와 b의 합은" + (a+b));
		System.out.println("문자 = " + (int)ch);
		System.out.println(str);
	}

}