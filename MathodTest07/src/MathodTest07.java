
public class MathodTest07 {
	
	//������ ���� ��������
	static int x = 700;//�������� (global variable)
	static int y = 900;
	
	public static void printX() {
		System.out.println("3. x = " + x);
	}
	
	public static void main(String[] args) {
		System.out.println("1. x = " + x);
		
		int x = 800;//��������(local variable)
		
		System.out.println("2. x = " + x);
		
		printX();
		
		
		System.out.println("4. x = " + MathodTest07.x);
		
		System.out.println("5. y = " + y);
	}

}
