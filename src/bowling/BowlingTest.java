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
	@DisplayName("Gutter game 테스트 코드 생성")
	void test_should_return_0_when_game_is_gutter() {
		gutterGame(20, 0);
		
		assertEquals(0, bowling.score());
	}
	
	@Test
	@DisplayName("roll 메소드 간단히 구현. 5점씩 넣을 때 총 점수는 100점")
	void test_should_return_100_when_all_of_pins_are_5_for_simple_score_function() {
		gutterGame(20, 5);
		
		assertEquals(100, bowling.score());
	}
	
	public void gutterGame(int count, int pins) {
		for(int i = 0; i < count; i++) {
			bowling.roll(pins);
		}
	}
}
