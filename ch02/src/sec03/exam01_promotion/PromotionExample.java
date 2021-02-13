package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		// int ← byte -------(※1)
		byte byteValue =10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		// int ← char -------(※2)
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 =" + intValue);
		
		// long ← int -------(※3)
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		// double ← int -------(※4)
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		// float(4) ← long(8) -------(※5)
		longValue = 10000000000L;
		float floatValue = longValue;
		System.out.println(floatValue);

	}

}
