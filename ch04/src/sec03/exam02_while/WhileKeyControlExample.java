package sec03.exam02_while;

public class WhileKeyControlExample {
											//예외처리
	public static void main(String[] args) throws Exception{
		boolean run = true;
		int speed = 0;
		int KeyCode = 0;
		
		while(run) {
			if(KeyCode !=13 && KeyCode != 10) {
				System.out.println("--------------------");
				System.out.println("1.종속|2.감속|3.중지");
				System.out.println("--------------------");
				System.out.println("선택 :");
			}
			KeyCode = System.in.read();
			
			if(KeyCode == 49) {
				speed ++;
				System.out.println("현재속도 = " + speed);
				
			}else if(KeyCode==50) {
				speed--;
				System.out.println("현재속도 = " + speed);
			}else if(KeyCode==51) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
//		while(true) {
//		int KeyCode = System.in.read(); // SYSTEM으로부터 입력을 불러온다.
// 		위에 선언이 되었으므로 따로 선언할 필요가 없어.		
//			System.out.println(KeyCode); // 49 13 10 이 나옴
		}

		
	}
