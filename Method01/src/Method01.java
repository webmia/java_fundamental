import java.util.Scanner;

public class Method01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];
		
		for(int i=0; i<height.length; i++) {
			System.out.println("----" + (i+1) + "��° �л�-----");
			System.out.print("���� : ");
			height[i] = sc.nextInt();
			System.out.print("ü�� : ");
			weight[i] = sc.nextInt();
			System.out.print("���� : ");
			age[i] = sc.nextInt();
		}
		
		int maxHeight = height[0];
		if(maxHeight < height[1])	maxHeight = height[1];
		if(maxHeight < height[2])	maxHeight = height[2];
		
		int maxWeight = weight[0];
		if(maxWeight < weight[1])  maxWeight = weight[1];
		if(maxWeight < weight[2])  maxWeight = weight[2];
		
		
		int maxAge = age[0];
		if(maxAge < age[1])  maxAge = age[1];
		if(maxAge < age[2])  maxAge = age[2];
		
		System.out.println("������ �ִ밪 : "+ maxHeight);
		System.out.println("ü���� �ִ밪 : "+ maxWeight);
		System.out.println("������ �ִ밪 : "+ maxAge);
		
		
		sc.close();
	}
	
}
