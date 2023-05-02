package sec03.exam07;

public class PrimitiveAndStringConverionExample {

	public static void main(String[] args) {
		//int value1 = Integer.parseInt("10");
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		//Integer.parseInt : 스트링타입의 값("")을 int값으로 바꿔주는 것.
		//그외에 숫자와 관련된 타입은 전부 사용이 가능하다.(byte, short, long, float, double)
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}

}
