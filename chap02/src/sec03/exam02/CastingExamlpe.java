package sec03.exam02;

public class CastingExamlpe {

	public static void main(String[] args) {
		//Casting(강제 형 변환)  promotion(자동형 변환)	
		
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		//charValue = 44032;  44032는 아스키코드로 [가] 임. 그래서 정답은 [가]
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		//double에서는 3.14의 소수점까지 표기 되지만 int로 강제 형 변환을 줬기때문에 소수점은 버린다.
	}

}
