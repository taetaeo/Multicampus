package sec03.exam01_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		
		for(int m=2; m<=9; m++) {
			System.out.println("****"+ m +"단 ****");
			for(int n=1; n<=9; n++) { 
				System.out.println(m + "x" + n + "=" + (m*n));
// 바깥 쪽 for문이 한 번 돌때 안 쪽 for문은 9번 도는 것을 의미한다.
			}
		}

	}

}
