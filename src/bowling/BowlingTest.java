package bowling;

import static org.junit.Assert.assertEquals;

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
	@DisplayName("roll 메소드 생성")
	void test_can_make_roll_function() {
		bowling.roll(0);
	}
	
	@Test
	@DisplayName("Score 메소드 생성")
	void test_can_make_score_function() {
		assertEquals(0, bowling.score());
	}
	

}
