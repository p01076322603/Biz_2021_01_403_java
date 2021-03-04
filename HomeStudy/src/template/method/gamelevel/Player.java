package template.method.gamelevel;

public class Player {

	private PlayerLevel level; // playerLevel 추상클래스를 자료형으로 가지는 level 객체 선언

	// Player 클래스의 객체가 인스턴스화될때 생성자로 level 객체를 BeginnerLevel 클래스로 초기화
	// BeginnerLevel 클래스로 재정의된 PlayerLevel 참조자료형의 showLevelMessage method 호출
	public Player() { 
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	// playLevel 추상클래스를 상속받은 하위클래스의 객체를 매개변수로 받아 Player 객체의 
	// PlayerLevel 자료형으로 선언되어있는 level에 저장, 매개변수로 전달받은 객체의
	// 재정의된 showLevelMessage() method 호출(level의 showLevelMessage() method 호출)
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	// play method가 호출되면서 받은 매개변수를 playerLevel의 하위 클래스의 객체에 전달하고
	// 하위 클래스의 객체는 상위클래스인 playerLevel에게서 상속받은 go method()를 매개변수값을 받아 실행
	public void play(int count) {
		level.go(count);
	}
	
}
