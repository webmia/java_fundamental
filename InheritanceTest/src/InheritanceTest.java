class Parent{
	int money = 2000000000;
	
	void appearance() {
		System.out.println("�߻��� �ܸ�");
	}
	
	void character() {
		System.out.println("ȭ���� ����");
	}
	
	int getMoney() {
		return money;
	}
}

class Child extends Parent{
	
	@Override
	void appearance() {
		super.appearance();
		System.out.println("��ĥ�� Ű");
	}
	
	@Override
	void character() {
		System.out.println("������ ����");
	}

	
} 

public class InheritanceTest {
	public static void main(String[] args) {
		
		Child boy = new Child();
		boy.appearance();
		boy.character();
		System.out.println("����� " + boy.money + "�� ������ �ֽ��ϴ�.");
		
	}
}
