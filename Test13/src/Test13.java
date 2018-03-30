
// 입력 3개정수 / 최대 최소
import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("a 값 입력 : ");
		int a = sc.nextInt();
		System.out.print("b 값 입력 : ");
		int b = sc.nextInt();
		System.out.print("c 값 입력 : ");
		int c = sc.nextInt();
		int max = a, min = a;
		/*
		 * if (a < b) { //a min if (b < c) { //c max max = c; } else { //b max max = b;
		 * } min = a; } else if (c < b) { //b min if (a < c) { //c max max = c; } else {
		 * //a max max = a; } min = b; } else { //c min if (a < b) { //b max max = b; }
		 * else { //a max max = a; } min = c; }
		 */
		// 변수 초기화 단계에서 값을 넣어서  if문을 줄이자.
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}

		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}

		System.out.println("최소값 :" + min + " 최대값 : " + max);

	}

}
