package sec02.exam10;

public class test01 {

	public static void main(String[] args) {
		int[] a = {6, 16, 46, 74, 50, 10};
		
		int b = 0;
		
		for (int i=0; i<a.length ; i++){
			b += a[i];
		}
		System.out.println(b);
		System.out.println((double) b/a.length);
		
		
	}

}
