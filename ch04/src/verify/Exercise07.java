package verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.println("선택>");
			
// 키보드로부터 입력된 수를 얻고 싶다면 nextInt() <-> 키보드로부터 입력된 문자를 얻고 싶다면 nextLine()
			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.println("예금액>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.println("출금액>");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고>");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;

			}
			
			System.out.println();
			System.out.println("프로그램 종료");
		}
		
	}

}
