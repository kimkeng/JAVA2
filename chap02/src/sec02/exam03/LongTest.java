package sec02.exam03;

public class LongTest {

	public static void main(String[] args) {
		long a = 2100000000;
		System.out.println(a);
		//보면 long a 가 21억 아래면 끝에 L을 붙이지 않아도 실행이 된다. 이는 int의 최대범위가 21억대 이기 때문이다.
		
		long b = 2200000000L;
		//long b 의 값은 22억 하고 끝에 L을 붙여줬다. 여기서 L을빼면 int의 범위가 넘어가기에 컴파일 에러가 뜬다.
		System.out.println(b);
	}

}
