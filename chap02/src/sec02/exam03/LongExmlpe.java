package sec02.exam03;

public class LongExmlpe {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; 
		//컴파일 에러 21억이 넘으면 숫자 끝에 L표기 (int 범위 : -2,147,483,648 ~ 2,147,483,647)
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		//System.out.println(var3);
		System.out.println(var4);
	}

}
