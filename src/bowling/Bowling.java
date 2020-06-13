package bowling;

public class Bowling {
	
	int[][] score = new int[10][3];

	public void roll(int i) {
	}

	public int score() {
		
		int scoreSum = 0;
		
		for(int i = 0; i < 10; i++) {
			scoreSum += score[i][0];
			scoreSum += score[i][1];
		}
		
		return scoreSum;
	}

}
