package sec02.exam07;

public class test01 {

	public static void main(String[] args) {
		int a [] = new int [3];
		a [0] = 5;
		a [1] = 5;
		a [2] = new String ("5");
		
		System.out.println( a[0] == a[1]); 
		System.out.println( a[0] == a[2]);
		System.out.println( a[0].equals(a[2]));
	}

}
