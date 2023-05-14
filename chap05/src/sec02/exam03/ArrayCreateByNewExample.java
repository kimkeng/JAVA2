package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		//int형으로 가지는 배열 이름이 arr1 참조 배열 형태의 선언 길이 3개짜리를 선언하자
		int [] arr1 = new int [3];
		for(int i=0;i<3;i++) {		//0,1,2하니까 총 3번 실행.
			System.out.println("arr1[" + i + "] :" + arr1[i]);
		}
		System.out.println("");
		
		double [] arr2 = new double[3];
		for(int i=0;i<3;i++) {	
			System.out.println("arr2[" + i + "] :" + arr2[i]);
		//배열은 한번크기를 설정하면 바꾸지 못함
		}
		System.out.println("");
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3;i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]);
		}
		System.out.println("");
		
		String [] arr3 = new String[3];
		for(int i=0;i<3;i++) {		
			System.out.println("arr3[" + i + "] :" + arr3[i]);
		}
		System.out.println("");
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0;i<3;i++) {
			System.out.println("arr3[" + i + "] :" + arr3[i]);
		}
	}

}
