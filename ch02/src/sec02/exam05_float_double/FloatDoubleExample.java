package sec02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		// 실수값 저장 -------(※1)
		double var1 = 3.14; 
		
//		float var2 = 3.14; 사이즈가 작은 float 타입에 저장 할 수 없으미로 컴파일 에러가 발생한다.
		float var3 = 3.14F;
		
		// 정밀도 검사 -------(※2)
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		
		// e 사용하기 -------(※3)
		int var6 = 3000000; // 300000
		double var7 = 3e6; // 3*10의 6승  = 300000.0
		float var8 = 3e6f; // 3*10의 6승을 float타입으로 저장 = 300000.0
		double var9 = 2e-3; // 2*10-2승 = 0.002
		
		System.out.println("---------------(※1)");
		System.out.println(var1); 
		System.out.println(var3);		
		
		System.out.println("---------------(※2)");
		System.out.println(var4); 
		System.out.println(var5);
		
		System.out.println("---------------(※3)");
		System.out.println(var6); 
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		
		
		
		
	}

}
