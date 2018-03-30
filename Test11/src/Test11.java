//국어 영어 수학 입력후 합계 평균 학점 A 기준  90a 80b 70c 60d 나머지f 

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수입력(0~100):");
		int kor = sc.nextInt();
		System.out.print("영어점수입력(0~100):");
		int eng = sc.nextInt();
		System.out.print("수학점수입력(0~100):");
		int mat = sc.nextInt();

		// 총점
		int sum;
		// 평균
		double avg;
		// 학점
		String scr;
		
		sum = kor + eng + mat;
		avg = (double) sum / 3;

		System.out.println("총점:" + sum);
		System.out.println("평균:" + avg);

		// 학점계산 &&하면서 까지 불필요한 것 안하는게 좋음.
		// 변수선언을해서 간소하는것이 좋음.
		// 1번 방법
		/*if (avg >= 90) {
			scr = "A";
		 	if (avg >= ){
		 		scr += "+"; 
		 	}else if (avg <){
		 		scr += "-";
		 	}		
		} else if (avg >= 80) {
			scr = "B";
			if (avg >= ){
		 		scr += "+"; 
		 	}else if (avg <){
		 		scr += "-";
		 	}		
		} else if (avg >= 70) {
			scr = "C";
		} else if (avg >= 60) {
			scr = "D";
		} else {
			scr = "F";
		}*/
		// 2번 방법 switch로 바꾸기
		switch ((int)avg / 10){
		case 10: case 9:
			scr = "A";
			break;
		case 8:
			scr = "B";
			break;
		case 7:
			scr = "C";
			break;
		case 6:
			scr = "D";
			break;
		default:
			scr = "F";
			break;
		}
		
		System.out.println(scr+"학점입니다.");
		sc.close();
	}

}
