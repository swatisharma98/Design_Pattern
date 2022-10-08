package strategy;

public class MainDuck {

	public static void main(String[] args) {
		
		
		MallardDuck duck = new MallardDuck();
		duck.swim();
		duck.performFly();
		duck.performQuack();
		duck.setFlyBehaviour(new FlyNoWay());
		duck.performFly();
		
//		Duck rduck = new RubberDuck();
//		rduck.display();
//		

	}

}
