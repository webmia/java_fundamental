import java.util.Scanner;
public class Array03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л� ���� ó�� ���α׷�(�迭Ȱ��)");
		System.out.print("�л� �� �Է� : ");
		int n = sc.nextInt();
		
		int[] st = new int[n];
		int sum = 0;
		
		for(int i=0; i<st.length; i++) {
			System.out.print((i+1) + "��° �л��� ���� �Է� :");
			st[i] = sc.nextInt();
			sum += st[i];
		}
		
		System.out.println();
		System.out.println(st.length + " ���� ���� �� :" + sum);
		System.out.println(st.length + " ���� ���� ��� :" + (double)sum/st.length);
		sc.close();
		
	}

}
