
# bowling-game
* 볼링게임 TDD Practice
* http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata (엉클 밥의 볼링 게임)

## 볼링게임 설명
* 볼링 게임은 10개의 프레임으로 구성된다.
* 각 프레임은 보통 2번의 롤 기회를 갖는다.
* 스페어 처리 : 10 + next frame의 first roll score
* 스트라이크 처리 : 10 + 스트라이크 이후 첫번째 롤 점수 + 스트라이크 이후 두번째 롤 점수
* 10번째 프레임은 다름. spare, strike 처리 시에 3번을 던질 수 있음
* 스코어는 항상 모든 프레임이 끝났을 때만 보여줌
