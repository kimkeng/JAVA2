package sec04.exam01;

public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);  
		// %d원 == [%] 다음에 [d(소수)123] 이 나온다.
		System.out.printf("상품의 가격:%6d원\n", value);
		// %6d원 == [%] 다음에 나오는 숫자만큼 [6] 번을 공백.그후 지정해준 [d(소수)123] 다음 [원] 이 나온다.
		System.out.printf("상품의 가격:%-10d원%n", value);
		// %-10d원 == [%] 다음 [-10] 이니까 [d(소수)123] 을 쓰고 10번 의 공백후 [원] 이 나온다.
		System.out.printf("상품의 가격:%10d원%n", value);
		// %10d원 == [%] 다음에 나오는 숫자만큼 [10] 번을 공백. 그후 지정해준 [d(소수)123] 다음 [원] 이 나온다.
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		String name = "김갱";
		String job = "학생";
		System.out.printf("%6d ㅣ %-10s ㅣ %10s\n", 1, name, job);
		//printf에서 쓰는 %d(decimal)=소수, %f(float)=실수, %c(char)=문자, %s(String)=문자열.
		//지시자% 추가 : %b(boolean)논리연산 , %n 줄바꿈, %e 지수표현
		//이 예제에 나오는 d=소수1, s=문자열name, s=문자열job을 뜻함.
		//번외 : \n은 다음줄로 이동이라는 뜻 으로 println에서 ln을 뜻하는 것과 같다.
		
	}

}
