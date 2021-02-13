package sec03.exam01_for;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		
		for(float x = 0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
			// float는 0.1을 잘 처리하지 못함.
		}
			

	}

}
