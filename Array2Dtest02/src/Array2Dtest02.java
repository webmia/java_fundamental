import java.util.Scanner;
public class Array2Dtest02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �Է� : ");
		int h/*���� ���� height - h */ = sc.nextInt();
		
		System.out.print("���� �Է� : ");
		int w/*���� ���� width - w */ = sc.nextInt();
		
		int[][] a = new int[h][w];
		
		//�ʺ��� ���� �ľǿ�
		for(int i=0; i<a.length; i++) {
		  for(int j=0; j<a[i].length; j++) {
			a[i][j] = (int)(Math.random()*90)+10; //10~99¥���� ���ڸ��� ����
		  }
		}
		for(int i=0; i<a.length; i++) {
		  for(int j=0; j<a[i].length; j++) {
			  System.out.printf("%3d",a[i][j]);
		  }
		  System.out.println();
		}
		
//���� ���԰� ����� �ѹ��� ó�� 
/*		for(int i=0; i<h; i++) {
		  for(int j=0; j<w; j++) {
			a[i][j] = (int)(Math.random()*90)+10; //10~99¥���� ���ڸ��� ����
			System.out.printf("%3d",a[i][j]);
		  }
		  System.out.println();
		}*/
		
		sc.close();
	}

}
