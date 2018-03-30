
public class Test05 {

	public static void main(String[] args) {
		int kor, eng, mat, sum;	//변수 선언
		double avg;
		kor = 90;	//초기화
		eng = 90;
		mat = 92;
		
		sum = kor + eng + mat;	//합계
		avg = (double)sum / 3;	//평균
		
		System.out.println("세 과목의 합계 : " + sum);
		System.out.println("세 과목의 평균 : " + avg);
		
		float f = 1.6f;
		int i = (int)f;
		byte b = 10;
		
		int i2 = 300;
		byte b2 = (byte) i2;
	}

}
