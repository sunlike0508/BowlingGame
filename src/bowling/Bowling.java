package bowling;

public class Bowling {
	
	int[][] score = new int[10][3];
	int frame = 0;
	int first = 0;

	public void roll(int pins) {

		if(frame == 9) {
			if(first == 0) {
				score[frame][0] = pins;
				first++;
			} else if(first == 1){
				score[frame][1] = pins;
				first = 0;
			} else {
				score[frame][2] = pins;
				first = 0;
				frame++;
			}
		} else {
			if(first == 0) {
				score[frame][0] = pins;
				first++;
			} else {
				score[frame][1] = pins;
				first = 0;
				frame++;
			}
		}
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
