package main;

public class MainClass {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}

}
