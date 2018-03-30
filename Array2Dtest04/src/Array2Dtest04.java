
public class Array2Dtest04 {
	
	public static void main(String[] args) {
		
		int[][] a = /*new int[][]*/{
				{10,20,30,40},
				{50,60,70,80,90},					
				{11,22,55},//-java에서는 ,찍어도 가능 안찍어도 가능
		};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}

}
