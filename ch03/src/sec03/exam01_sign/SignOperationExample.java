package sec03.exam01_sign;

public class SignOperationExample {

	public static void main(String[] args) {
		int x = 100;
		int result1 = +x; // x의 부호 유지
		int result2 = -x; // x의 부호 변경
		
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100; //short 타입은 2바이트
//		short result3 = -s; 컴파일 에러가 나타난다. int로 해야함.
		int result3 = -s;
		System.out.println(result3);

	}

}
