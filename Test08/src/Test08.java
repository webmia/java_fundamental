
public class Test08 {

	public static void main(String[] args) {
		//비트연산자
		int a = 37, b = 25;
		
		System.out.println("a & b = " + (a&b));
		System.out.println("a | b = " + (a|b));
		System.out.println("a ^ b = " + (a^b));
		
		int c = 53, d = 36;
		
		System.out.println("c & d = " + (c&d));
		System.out.println("c | d = " + (c|d));
		System.out.println("c ^ d = " + (c^d));
		
		//쉬프트 연산자
		int a1 = 4, b1= 64;
		
		System.out.println("a1 << 4 = " + (a1<<4));
		System.out.println("b1 >> 3 = " + (b1>>3));
		
		//삼항연산자
		int a2 = 30, b2 = 10, c2;
		
		c2=(a2<b2)? a2 : b2;
		
		System.out.println("c2 ="+ c2);
		
		if (a2 <b2) {
			c2 = a2;
		}else {
			c2 = b2;
		}
		
		System.out.println("c2 =" + c2);
		
	}
	
}
