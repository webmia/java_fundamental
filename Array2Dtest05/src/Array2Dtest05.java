import java.util.Scanner;

public class Array2Dtest05 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		int[][] a = new int[n][n];
		
		//2���� �迭�� ���� �����ϴ� �κ�
		int k=1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = k++;
			}
		}
		
		//2���� �迭�� ����ϴ� �κ�
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		sc.close();
		
	}
}
