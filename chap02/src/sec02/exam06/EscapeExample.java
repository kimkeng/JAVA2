package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업"); 
		// \t는 tab (약 네번정도 스페이스바 한것과 비슷)
		System.out.println("행 단위 출력\n");
		// println과 \n을 같이쓰면 두번 줄바꿈
		System.out.print("행 단위 출력\n");
		// \n은 줄바꿈 println에서 ln도 줄바꿈
		System.out.println("우리는 \"개발자\" 입니다.");
		// 쌍따옴표를 추가로 쓰고싶으면 \"\" 이렇게 넣기
		System.out.println("봄\\여름\\가을\\겨울");
		// 역 슬레쉬를 프린트 하고 싶으면 \\ 이렇게 두번 써줄것
	}

}
