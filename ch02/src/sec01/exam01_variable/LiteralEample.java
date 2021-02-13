package sec01.exam01_variable;

public class LiteralEample {
	//실행을 위해서 메인메소드 작성
	public static void main(String[] args) {
		int var1 = 10;
		System.out.println(var1);
		
		int var2 = 010;
		System.out.println(var2);
		
		int var3 = 0x10;
		System.out.println(var3);
		
		double var4 = 0.25;
		System.out.println(var4);
		
		double var5 = 2E5;
		System.out.println(var5);
		
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '한';
		System.out.println(var7);
		
		System.out.println('\t' + "들여쓰기");
		System.out.println("대한"+'\r'+"민국");
		System.out.println("This"+'\''+"s Java");
		System.out.println("이것은"+'\''+ "중요" + '\''+ " 합니다");
		System.out.println("가격이"+ '\\'+"300원입니다.");
		
		char var8 ='\u0041';
		System.out.println(var8);
		
		String var9 = "자바";
		System.out.println(var9);
		
		boolean var10 = true;
		boolean var11 = false;
		System.out.println(var10);
		System.out.println(var11);
		
	}
}