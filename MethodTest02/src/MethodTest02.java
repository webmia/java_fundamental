import java.util.*;


public class MethodTest02 {
	
	//메소드 정의(선언)
	public static int max(int a, int b, int c) {
		
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		
		return max;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("--- " + (i+1) +"번째 학생 ---");
			System.out.print("신장 입력 : ");
			height[i] = sc.nextInt();
			System.out.print("체중 입력 : ");
			weight[i] = sc.nextInt();
			System.out.print("나이 입력 : ");
			age[i] = sc.nextInt();
			
		}
		
		//메소드 호출부분
		int maxHeight = max( height[0], height[1], height[2]);
		int maxWeight = max( weight[0], weight[1], weight[2]);
		int maxAge = max( age[0], age[1], age[2]);
		
		System.out.println("신장의 최댓값 : " + maxHeight);
		System.out.println("체중의 최댓값 : " + maxWeight);
		System.out.println("나이의 최댓값 : " + maxAge);
		
		sc.close();
		
	}
	
}
