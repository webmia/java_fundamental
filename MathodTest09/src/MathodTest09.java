import java.util.Arrays;
import java.util.Scanner;

public class MathodTest09 {
	
	public static int linearSearch(int[] a, int c) {
		/*int equal = 0;
		for(int i=0; i<a.length; i++) {
			if(c == a[i]) {
				equal=1;
			}
		}
		return equal;*/
		
		/*boolean t = false;
		for(int i=0; i<a.length; i++) {
			if(c == a[i]) {
				t= true;
			}
		}
		return t;*/
		
		//������Ǯ��
		//1�� ��� - 1���� ã���� �ٷ� �����ϴ� �˻��޼���(2�� �˻��Ұ�)
 		for(int i=0; i<a.length; i++) {
			if(c == a[i]) {
				return i;
			}
		}
		return -1;
	}
	
	//2�� ���  - 2�� �̻��� ã�������� ������ �˻� �޼ҵ�
	public static int linearSearch2(int[] x, int k) {
		int count = 0;
		for(int i=0; i<x.length; i++) {
			if(x[i]==k) {
				System.out.print((i+1) + "��°");
				++count;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****---- ���� �˻����α׷� ----****");
		System.out.print("�迭�� ���� �Է� : ");
		int n = sc.nextInt();
		
		System.out.print("�˻� �� �� �Է� : ");
		int c = sc.nextInt();
		
		int[] a = new int[n]; 
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*10)+1;
			/*for(int j = 0; j<a.length; j++) {
				i--;
				break;
			}*/
		}
		System.out.println(Arrays.toString(a));
		
		/*if(linearSearch(a,c) == 1) {
			System.out.println("���� �ֽ��ϴ�.");
		}else {
			System.out.println("���� �����ϴ�.");
		}*/
		
		/*if(linearSearch(a,c) == true) {
			System.out.println("���� �ֽ��ϴ�.");
		}else {
			System.out.println("���� �����ϴ�.");
		}*/
		
		//1����� �޼ҵ� Ȱ�� -������Ǯ��(1���� �˻�)
		/*int findIdx = linearSearch(a,c);
		if(findIdx == -1) {
			System.out.println("���� �����ϴ�.");
		}else {
			System.out.println("�˻��� ���� " + (findIdx+1) + "��°�� �ֽ��ϴ�.");
		}
		
		*/
		
		//2����� �޼ҵ� Ȱ��(2���̻� �˻��ϴ� ���)
		int count = linearSearch2(a,c);
		if(count == 0) {
			System.out.println("�˻��� ���� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("�ֽ��ϴ�.\n �˻��� ����" + count + "�� �����մϴ�.");
			//\n�� �ٹٲ� ȿ�� �־��ִ°�
		}
		sc.close();
	}

}
