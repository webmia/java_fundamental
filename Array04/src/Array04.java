import java.util.Scanner;
import java.util.Random;

//import java.util.*;  --java.util안의 변수들을 사용하겠다는 의미

public class Array04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력받아 최대값 / 최소값 구하기");
		Random r = new Random();
		
		
		int[] a = new int[10];
		//1번 방법 - 정수를 직접 입력                           
		/*for(int i=0; i<a.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			a[i] = sc.nextInt();
		}*/
		
		//2번 방법 - 정수를 난수로 입력
		System.out.print("[");
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(100);
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
		
		int max = a[0], min = a[0];
		for(int i=1; i<a.length; i++) {
			if(max < a[i]) {
				max=a[i];
			}
			if(min > a[i]) {
				min=a[i];
			}
		}
		System.out.println("최대값은 " + max + "입니다.");
		System.out.println("최소값은 " + min + "입니다.");
		sc.close();
	}

}
