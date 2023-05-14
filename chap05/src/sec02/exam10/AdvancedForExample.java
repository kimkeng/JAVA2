package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 15, 20, 18, 14, 22 };
		
		int sum = 0;
//		for (int aaa : scores) {
//			sum = sum + aaa;
//		}
		for (int i=0; i<scores.length;i ++) {
			sum += scores[i];
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}

}
