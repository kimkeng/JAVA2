package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
        //배열   안의  배열
		
		int[][] mathScores = new int [3][2];
		for(int i=0;i<mathScores.length;i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]=" + mathScores[i][k]);
			}
		}
		System.out.println();
		
		
		int[][] englishScores = new int [2][]; 
		//new int 첫 [] 2층이고 두번째 [] 는 방 갯수 인데 층마다 방을 다르게 설정해줘서 숫자를 넣어주지 않은것.
		englishScores[0] = new int[2]; //1층
		englishScores[1] = new int[3]; //2층
		for(int i=0;i<englishScores.length;i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
		englishScores[0][0] =10;
		System.out.println(englishScores[0][0]);
	}

}
