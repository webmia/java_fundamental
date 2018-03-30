
public class Test04 {

	public static void main(String[] args) {
		final double PI; // PI: 원주율
		double r = 7.5;	// r: 반지름
		
		
		PI = 3.14;

		//byte b = 128;
		
		//접미사
		float f = 3.14f; // overflow / float로 쓰고싶으면 뒤에 f,F
		long l = 10000000000L; // long으로 쓰고 싶으면 l,L
		
		int i = 100;
		int oct = 0100;
		int hex = 0x100;
		
		System.out.println("원의 둘레 = " + (2*PI*r));
		System.out.println("원의 면적 = " + (PI*r*r));

		System.out.println("i = " + i);
		System.out.println("oct = " + oct);
		System.out.println("hex = " + hex);
	}

}
