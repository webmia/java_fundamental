
public class Array02 {
	
	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		a[1]=10;
		a[3]=30;
		
		//length는 상수 , 값이 이미 들어가 있기때문에 값을 재입력하는 것은 불가 하다. a.length =10;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i +"] = " +a[i] );
		}
	}

}
