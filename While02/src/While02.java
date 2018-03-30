public class While02 {

	public static void main(String[] args) {

/*		int i = 1, sum = 0;

		while (sum + i < 100) {
			sum = sum + i;
			System.out.println("1부터 " + i + "까지의 합은 " + sum);
			i++;
		}*/
		
		int sum = 0;
		
		for(int i = 1; sum + i < 100; i++) {
			sum = sum + i;
			System.out.println("1부터 " + i +"까지의 합은 "+sum);
				
		}
		
	}

}
