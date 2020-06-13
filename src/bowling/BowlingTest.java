package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BowlingTest {
	
	Bowling bowling;
	
	@BeforeEach
	@DisplayName("클래스 생성 가능")
	void setUp() {
		bowling = new Bowling();
	}
	
	@Test
	@DisplayName("roll 메소드 생성 가능")
	void test_can_make_roll_function() {
		bowling = new Bowling();
		bowling.roll(0);
	}

}
