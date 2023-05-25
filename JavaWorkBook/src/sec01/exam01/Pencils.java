package sec01.exam01;

public class Pencils {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int a = pencils/students;
		int b = pencils%students;
		//[%]는 나누고 남은값
		//[/]는 나누기
		//[*]는 곱하기
		
		System.out.println("한명당 30개씩 "+ a +"명");
		System.out.println("남은 갯수는 " + b + "개");
	}

}
