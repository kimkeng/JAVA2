package sec01_exam01;

public class VariableExchangeExamle {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		// println : print line 여기서 line는 줄바꿈을 뜻하고 "" : 쌍 따옴표는 문자 그대로를 출력함.
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}

}
