package sec03.exam03_deny_logic;

public class DenyLogicOperatiorExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play; // true가 false로 바뀜
		System.out.println(play);
		
		play = !play; // false가 true로 바뀜
		System.out.println(play);

	}

}
