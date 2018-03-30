import java.util.Scanner;

public class Game01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = { "가위", "바위", "보" };
		int[] score = new int[3];		//가위바위보 승패무 수를 지정
		String retry;					//다시한번
		
		System.out.println("**** 가위바위보 게임입니다. ****");
		
		do{
			System.out.print("유저 입력(0-가위,1-바위,2-보) : ");
			int user = sc.nextInt();
			int com = (int) (Math.random() * 3); // 0부터 3미만 난수
			
			System.out.println("유저는 " + s[user] + "이고 컴퓨터는 " + s[com] + "입니다.");
			
			// 유저 승: 1 / 컴 승 :2 / 0
			int result = (user - com + 3) % 3;
			switch (result) {
			case 1:
				System.out.println("user가 승리 하였습니다.");
				++score[1];
				break;
			case 2:
				System.out.println("user가 패배하였습니다. com이 승리 하였습니다.");
				++score[2];		
				break;
			case 0:
				System.out.println("비겼습니다.");
				++score[0];
				break;
			}
			
			System.out.print("한번 더 하시겠습니까?(Y/N) : ");
			retry = sc.next();
			
		}while(retry.equalsIgnoreCase("y"));
		System.out.println("유저의 승률 : " + score[1] + "승" + score[2] + "패" + score[0] + "무");
		sc.close();
	}

}
