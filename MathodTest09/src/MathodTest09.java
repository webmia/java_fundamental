import java.util.Arrays;
import java.util.Scanner;

public class MathodTest09 {
	
	public static int linearSearch(int[] a, int c) {
		/*int equal = 0;
		for(int i=0; i<a.length; i++) {
			if(c == a[i]) {
				equal=1;
			}
		}
		return equal;*/
		
		/*boolean t = false;
		for(int i=0; i<a.length; i++) {
			if(c == a[i]) {
				t= true;
			}
		}
		return t;*/
		
		//선생님풀이
		//1번 방법 - 1개를 찾으면 바로 리턴하는 검색메서드(2번 검색불가)
 		for(int i=0; i<a.length; i++) {
			if(c == a[i]) {
				return i;
			}
		}
		return -1;
	}
	
	//2번 방법  - 2개 이상을 찾았을때도 가능한 검색 메소드
	public static int linearSearch2(int[] x, int k) {
		int count = 0;
		for(int i=0; i<x.length; i++) {
			if(x[i]==k) {
				System.out.print((i+1) + "번째");
				++count;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****---- 선형 검색프로그램 ----****");
		System.out.print("배열의 갯수 입력 : ");
		int n = sc.nextInt();
		
		System.out.print("검색 할 값 입력 : ");
		int c = sc.nextInt();
		
		int[] a = new int[n]; 
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*10)+1;
			/*for(int j = 0; j<a.length; j++) {
				i--;
				break;
			}*/
		}
		System.out.println(Arrays.toString(a));
		
		/*if(linearSearch(a,c) == 1) {
			System.out.println("값이 있습니다.");
		}else {
			System.out.println("값이 없습니다.");
		}*/
		
		/*if(linearSearch(a,c) == true) {
			System.out.println("값이 있습니다.");
		}else {
			System.out.println("값이 없습니다.");
		}*/
		
		//1번방법 메소드 활용 -선생님풀이(1개만 검색)
		/*int findIdx = linearSearch(a,c);
		if(findIdx == -1) {
			System.out.println("값이 없습니다.");
		}else {
			System.out.println("검색한 값은 " + (findIdx+1) + "번째에 있습니다.");
		}
		
		*/
		
		//2번방법 메소드 활용(2개이상 검색하는 방법)
		int count = linearSearch2(a,c);
		if(count == 0) {
			System.out.println("검색한 값은 존재하지 않습니다.");
		}else {
			System.out.println("있습니다.\n 검색한 값이" + count + "개 존재합니다.");
			//\n은 줄바꿈 효과 넣어주는것
		}
		sc.close();
	}

}
