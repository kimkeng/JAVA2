package sec02.exam09;

public class test1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z = 1 ;
		
		
		x ++;
		++ x;
		System.out.println("x=" + x);
		
		y--;
		--y;
		System.out.println("y=" + y);
		
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		z= ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		z= ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);

	}

}
