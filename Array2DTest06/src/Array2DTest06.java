import java.util.Scanner;

public class Array2DTest06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****��� �Ǻ� ���α׷�******");
		
		int[][] a = new int[4][5];
		String retry=null;
		
		do {
			System.out.print("����� ���� �Է��ϼ���(1~45) : ");
			int n = sc.nextInt();
			
			//2���� �迭�� ���� �����ؼ� ���� �� ���
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					a[i][j]=(int)(Math.random()*45)+1;
					
				}
				
			}
			
			//2���� �迭 ���,����� ���� 2���� �迭�� ��(����)�� ��
			int count=0;
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					if (a[i][j]==n) {
						++count;
						System.out.printf(" *%2d*",a[i][j]);
						//System.err.printf("%3d",a[i][j]);
		//���� ������ err���/ ���� �۾��� ���� / ����ϴ� �ӵ��� out�̶� �޶� ���� �� �ȸ��� ���� ����
					}else{
						System.out.printf("%3d",a[i][j]);
					}
					
				}
				System.out.println();
			}
			
			switch(count) {
			case 0:
				System.out.println("���볯�Դϴ�.");
				break;
			case 1:
				System.out.println("������ ���Դϴ�.");
				break;
			case 2:
				System.out.println("���� ���� ���Դϴ�.");
				break;
			case 3:
				System.out.println("��������� ���Դϴ�.");
				break;
			case 4:
				System.out.println("����� ���Դϴ�.");
				break;
			default:
				System.out.println("��Ʈ�� ¯ ����� �� �Դϴ�.");
			
			}
			System.out.println("���߽� ������" + count + "�Դϴ�.");
			System.out.println();
			
			System.out.print("�ٽ� �ѹ� �õ��Ͻðڽ��ϱ�? (Y/N)");
			retry = sc.next();
		}while(retry.equalsIgnoreCase("y"));
		
		sc.close();
	}

}
