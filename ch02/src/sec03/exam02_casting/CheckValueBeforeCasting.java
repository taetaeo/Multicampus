package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		int i = 125;
		// -------(※1)
		if(i<-128 || i>127) { // -128~127
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		} else {
			byte b = (byte)i;
			System.out.println(b); 
		}
		// -------(※2)
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) { // -128~127
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		} else {
			byte b = (byte)i;
			System.out.println(b); 
		}
		
		// (※1)과 (※2)는 같다.

	}

}
