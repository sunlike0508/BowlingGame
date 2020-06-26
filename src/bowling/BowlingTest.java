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
	@DisplayName("Gutter game 테스트 코드 생성")
	void test_should_return_0_when_game_is_gutter() {
		gutterGame(0, 0);
		
		assertEquals(0, bowling.score());
	}
	
	@Test
	@DisplayName("roll 메소드 간단히 구현. 모든 기회에 5점. 각 프레임 10점씩 넣을 때 총 점수는 105점")
	void test_should_return_100_when_all_of_pins_are_5_for_simple_score_function() {
		gutterGame(0, 5);
		
		assertEquals(105, bowling.score());
	}
	
	@Test
	@DisplayName("4번만 5점씩 넣고 그 이후는 거터 게임 진행. 총 점수는 20점")
	void test_should_return_20_when_input_is_5_until_fourth() {
		bowling.roll(5);
		bowling.roll(5);
		bowling.roll(5);
		bowling.roll(5);
		gutterGame(4, 0);
		
		assertEquals(20, bowling.score());
	}
	
	public void gutterGame(int count, int pins) {
		for(int i = count; i < 21; i++) {
			bowling.roll(pins);
		}
	}
}
