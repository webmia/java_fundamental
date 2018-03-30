import java.util.*;

public class BubbleSort01 {

	public static void main(String[] args) {
		int[] a = { 50, 70, 20, 10, 30 ,44,55,66,77,88};
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
			System.out.print(i + 1 + "회전 후 :");
			System.out.println(Arrays.toString(a));
			if(!checked) {
				break;
			}
		}
		System.out.print("버블 정렬 후");
		System.out.println(Arrays.toString(a));
	}

}
