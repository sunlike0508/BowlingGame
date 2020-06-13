package bowling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BowlingTest {

	@Test
	@DisplayName("클래스 생성 가능")
	void test_can_make_game_class() {
		Bowling bowling = new Bowling();
	}
	
	@Test
	@DisplayName("roll 메소드 생성 가능")
	void test_can_make_roll_function() {
		Bowling bowling = new Bowling();
		bowling.roll(0);
	}

}
