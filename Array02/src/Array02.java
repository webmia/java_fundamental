
public class Array02 {
	
	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		a[1]=10;
		a[3]=30;
		
		//length�� ��� , ���� �̹� �� �ֱ⶧���� ���� ���Է��ϴ� ���� �Ұ� �ϴ�. a.length =10;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i +"] = " +a[i] );
		}
	}

}
