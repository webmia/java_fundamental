//
public class Test16 {

	public static void main(String[] args) {

		//1번
		/*for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}*/
		
		//2번
		//10부터 1까지
		/*for(int i = 10; i < 0; i--) {
			System.out.println(i);
		}*/
		
		//3번
		//1부터 10까지 13579
		/*for(int i = 1 ; i <= 10 ; i = i + 2) {
			System.out.println(i);
		}*/
		
		//4번
		//13579
		/*for(int i = 1; i<=10; i++) {
			if( i%2 == 1) {
				System.out.println(i);
			}
		}*/
		//5번
		//1부터 1까지의 합은 1 
		//1부터 2까지의 합은 3
		//1부터 3까지의 합은 6
		//1부터 4까지의 합은 10
		/*int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println("1부터 " + i +"까지 합은 "+ sum);
		}*/
		
		//6번
		//*10개 찍기
		for(int i = 10; i > 0; i--) {
			System.out.print("*");
		}
		
	}

}
