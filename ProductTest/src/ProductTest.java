class Product{
	static int count =0;
	int serialNo;
	
	{
		serialNo = ++count;
	}
	Product() {}
	
}
public class ProductTest {
	
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1�� ��ǰ ��ȣ(sirial no)�� " + p1.serialNo);
		System.out.println("p2�� ��ǰ ��ȣ(sirial no)�� " + p2.serialNo);
		System.out.println("p3�� ��ǰ ��ȣ(sirial no)�� " + p3.serialNo);
		System.out.println("����� ��ǰ�� ���� ��� " + Product.count + "���Դϴ�.");
	}

}
