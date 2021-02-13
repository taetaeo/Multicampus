package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		
		// 강제타입변환 : char(2) ← int(4) -------(※1)
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		// 강제타입변환 : int(4) ← long(8) -------(※2)
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		// 강제타입변환 : int(4) ← double(실수) -------(※3)
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);



	}

}
