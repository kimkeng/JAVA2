package sec02.exam04;

public class CharExamlpe {

	public static void main(String[] args) {
		//char c1 = "A" : 컴파일 에러  [ char라는 변수타입에는 꼭 작은 따옴표(홑따옴표) 쓰기 '' ]
		char c1 = 'A';      //문자를 직접 저장
		char c2 = 65;       //십진수로 저장 ( 소문자a는 97 )
		char c3 = '\u0041'; //16진수로 저장
		
		char c4 = '가';      //문자를 직접 저장
		char c5 = 44032;    //십진수로 저장
		char c6 = '\uac00'; //16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}

}
