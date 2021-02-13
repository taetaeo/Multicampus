package sec03.exam04_operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		// byte타입 연산 -------(※1)
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
//		byte byteValue3 = byteValue1 + byteValue2; 컴파일에러가 발생한다.
		// 따라서 byte타입이 아닌 int타입으로 변환
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		// char타입 연산 -------(※2)
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;
// int타입 이하의 정수타입을 연산하면 int로 자동 변환되어 연산
		int intValue2 = charValue1 + charValue2;
		System.out.println(intValue2);
		System.out.println("유니코드 = "+intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		// 정수의 연산 -------(※3)
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		// 정수 나누기 정수는 정수로 나온다.
		System.out.println(intValue4);
		
		
		// char타입 연산 -------(※4)
		int intValue5 = 10;
//		int intValue6 = 10/4.0; -> 정수는 자동으로 double타입으로
		double doubleValue = intValue5/ 4.0;
		System.out.println(doubleValue);

	}

}
