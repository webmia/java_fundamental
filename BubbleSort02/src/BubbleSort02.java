import java.util.*;

public class BubbleSort02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 갯수:");
		int n = sc.nextInt();
		int[] a = new int[n];

		// 난수 만드는법
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);// 0부터 0.9999....*100 -실수 / 0부터 1미만*100
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("버블 정렬 전:");
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length - 1; i++) {
			boolean checked = false;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					checked = true;
				}
			}
			System.out.print((i + 1) + "회전후");
			System.out.println(Arrays.toString(a));
			if (!checked) break;
		}
		System.out.print("버블 정렬 후 : ");
		System.out.println(Arrays.toString(a));

		sc.close();
	}

}
