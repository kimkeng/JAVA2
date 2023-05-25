package sec01.exam02;

public class Array2 {

	public static void main(String[] args) {
		int[] array = {135,3262,2341,3999,236};
		int max=0;
		for(int i=0; i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("배열의 최대값은: " + max);
	}

}
