package sec01.exam02;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			System.out.println(v2); //맞음
		}
		//int v3 = v1 + v2;
		//v2는 {}안에 있는데 결과는 {}바깥에 있어서 소멸됌 (결과도 {}안에 넣으면 v2를 일회성으로 사용 가능.)
		//System.out.println(v2); //틀림
		//sysout 타이핑 ctrl + Space 입력 : [System.out.println();]
	}

}
