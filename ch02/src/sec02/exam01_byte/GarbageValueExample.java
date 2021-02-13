package sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		
		var1++;
		System.out.println(var1);
		
		var1++;
		System.out.println(var1);
		
		var1++;
		System.out.println(var1);
		
		var1++;
		System.out.println(var1);
		
		byte var3 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var3++;
			var2++;
			System.out.println("var3 :" + var3 + "\t" +"var2 :" + var2);
		}
		

	}

}
