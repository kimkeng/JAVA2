package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		Student a1 = new Student();
		System.out.println("a1이 Student객체를 참조");
		System.out.println(a1.Student);
		
		
		Student a2 = new Student();
		System.out.println("a2도 Student객체를 참조");
		System.out.println(a2.Student);
	}

}
