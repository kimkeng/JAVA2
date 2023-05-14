package sec01.exam01;

public class test02 {

	public static void main(String[] args) {
		//변수 안의 숫자 바꿔주기
		int a = 10;
		int b = 20;
		
		System.out.println("a = " + a + ", b = " + b);
		
		int Change = a;
		a = b;
		b = Change;
		System.out.println("a = " + a + ", b = " + b);
	}

}