
public class BlockTest {
	
	static {
		System.out.println("Ʋ���� �ʱ���");
	}
	{
		System.out.println("�ν��Ͻ� �ʱ���");
	}
	
	public BlockTest() {
		System.out.println("����Ʈ ������");
	}
	public static void main(String[] args) {
		System.out.println("BlockTest bt1 = new BlockTest()");
		BlockTest bt1 = new BlockTest();
		
		System.out.println();
		System.out.println("BlockTest bt2 = new BlockTest()");
		BlockTest bt2 = new BlockTest();
		
	}
}
