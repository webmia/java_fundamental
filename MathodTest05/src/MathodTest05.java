import java.util.Scanner;

public interface MathodTest05 {
	
	public static void count(int x) {
		for(int i=x; i>=0; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("****** ī�������α׷� ******");
		System.out.print("���� �Է� :");
		int n = sc.nextInt();
		
		System.out.println("ī��Ʈ�� ���۵Ǿ����ϴ�.");
		count(n);
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
		
		sc.close();
		
	}

}
