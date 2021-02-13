package sec03.exam03_dowhile;

import java.util.Scanner; // Ctrl + Shift + 'o'

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
/* do-while문에서 	while문이 true가 되면 반복해서 돌게 되고
		false가 되면 빠져나오게 된다. */
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		// 키보드로부터 문자열을 읽기위해서 scanner라는 객체를 만듦.
		
/*		Scanner scanner = new Scanner(System.in);
		
		String inputString = scanner.nextLine();
		
		System.out.println(inputString);*/
	}

}
