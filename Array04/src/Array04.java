import java.util.Scanner;
import java.util.Random;

//import java.util.*;  --java.util���� �������� ����ϰڴٴ� �ǹ�

public class Array04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է¹޾� �ִ밪 / �ּҰ� ���ϱ�");
		Random r = new Random();
		
		
		int[] a = new int[10];
		//1�� ��� - ������ ���� �Է�                           
		/*for(int i=0; i<a.length; i++) {
			System.out.print((i+1) + "��° ���� �Է� : ");
			a[i] = sc.nextInt();
		}*/
		
		//2�� ��� - ������ ������ �Է�
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
		System.out.println("�ִ밪�� " + max + "�Դϴ�.");
		System.out.println("�ּҰ��� " + min + "�Դϴ�.");
		sc.close();
	}

}
