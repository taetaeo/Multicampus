package sec03.exam04_break;

public class CountuneExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			
			if(i%2 != 0) { // i가 홀수라면
				continue;
			}
			
			System.out.println(i);
		}
	
	}

}
