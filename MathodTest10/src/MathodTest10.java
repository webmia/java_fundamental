import java.util.Arrays;
import java.util.Scanner;

public class MathodTest10 {
	
	public static void swap(int[] a, int idx1, int idx2){
		int t= a[idx1];
		a[idx1] = a[idx2];
		a[idx2]=t;
	}
	
	public static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a,i,a.length-1-i);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---�迭�� ���� �Ųٷ� �ִ� ���α׷�---");
		System.out.print("�迭�� ���� �Է� : ");
		int n = sc.nextInt();
		
		int [] a = new int[n];
		for(int i = 0; i<a.length; i++) {
			a[i] = (int)(Math.random()*100)+1;
			
		}
		System.out.print("reverse �� : ");
		System.out.println(Arrays.toString(a));
		
		//�迭�� ���� �Ųٷ� ���� �ݺ���
		//1�����-�޼��带 ������� ������
		/*for(int i=0; i<a.length/2; i++) {
			int t = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = t;
		}*/
		
		
		//2�����- �޼��带 ����� ��
		reverse(a);
		System.out.print("reverse �� : ");
		System.out.println(Arrays.toString(a));
		
		
		sc.close();
	}

}
