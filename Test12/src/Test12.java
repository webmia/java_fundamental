import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학점계산 프로그램");
		
		System.out.print("국어점수 :");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 :");
		int mat = sc.nextInt();
		
		System.out.print("영어점수 :");
		int eng = sc.nextInt();
		
	    int sum = kor + mat + eng; 
	    double avg = (double)sum / 3;
	    
	    System.out.println("총점 : " + sum);
	    System.out.println("평균 : " + avg);
	    
	    String score;
	    
	    //1번방법
		
	    /*if (avg>=90) {
			score="A";
		} else if(avg>=80) {
			score="B";
		}else if(avg>=70) {
			score="C";
		}else if(avg>=60) {
			score="D";
		}else {
			score="F";
		}*/
		
		//2번방법
		
		switch((int)avg / 10) {
		case 10: case 9:
			score = "A";
			break;
		case 8:
			score = "B";
			break;
		case 7:
			score = "C";
			break;
		case 6:
			score = "D";
			break;
		default:
			score = "F";
			break;
		
		}
		
		System.out.print("학점 : " + score);
		
		sc.close();
		
		
	}
	
	
}
