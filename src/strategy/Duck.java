package strategy;

public class Duck {
	
	
	FlyBehaviour flyBehaviour;
	QuackableBehaviour quackBehaviour;
	
	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}
	public void setQuackBehaviour(QuackableBehaviour qk) {
		quackBehaviour = qk;
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	
	public void swim() {
		System.out.println("Duck swim");
	}
	
	public void display() {
		System.out.println("Duck");
	}

}
