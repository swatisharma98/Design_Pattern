package strategy;

public class MuteQuack implements QuackableBehaviour{

	@Override
	public void quack() {
		System.out.println("Mute Quack");
		
	}

}
