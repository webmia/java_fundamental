
public class StaticBlockTest {
	
	static int[] arr = new int[10];
	
	//Ŭ���� �ʱ���(���� �ʱ���)
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}
	public static void main(String[] args) {
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
