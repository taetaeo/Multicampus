package sec03.exam04_bit_reverse;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		System.out.println(toBinaryString(10)+"(십진수 :" + v1 +")");
		System.out.println(v2);
		System.out.println(v3);
		System.out.println("---------------");

		System.out.println(toBinaryString(v1)+"(십진수 :" + v1 +")");
		System.out.println(toBinaryString(v2)+"(십진수 :" + v2 +")");
		System.out.println("---------------");
		
		int v4 = -10;
		int v5 = ~v4; // 9
		int v6 = ~v4 + 1; // 9+1 = 10
		
		System.out.println(v5);
		System.out.println(v6);
	}
	
	public static String toBinaryString(int value) { // 메소드
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0" + str;
			
		}
		return str;
	
	}

}
