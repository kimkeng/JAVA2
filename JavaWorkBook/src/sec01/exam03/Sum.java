package sec01.exam03;

public class Sum {

	public static void main(String[] args) {
		int a = 0;
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			a = i;
			sum+=a;
			System.out.print(a);
			if(a<10) {
				System.out.print("+");	
			}else {
				
				System.out.print("=");
			}
		}
		System.out.print(sum);
	}

}
