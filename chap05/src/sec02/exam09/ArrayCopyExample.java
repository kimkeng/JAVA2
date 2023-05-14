package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		//arraycopy ()순서 뜻:원본 배열, 시작인덱스, 새 배열(그 외에는 null), 새 배열 시작 인덱스, 복사 할 갯수
		
		for(int i=0; i<newStrArray.length; i++) {
		System.out.print(newStrArray[i] + ", ");
		}
	}

}
