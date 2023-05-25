package sec01.exam02;

public class Array {

	public static void main(String[] args) {
		int[] a = {10,20,50,40,30};
		int max = 0;
		for(int i=0; i<a.length;i++) {
			
			if(max <a[i]) {
			max = a[i];
			
			}
			
				
		}
		System.out.println(max);	
	}

}
