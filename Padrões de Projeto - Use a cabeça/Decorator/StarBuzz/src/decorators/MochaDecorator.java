package decorators;

import main.Beverage;
import main.CondimentsDecorator;

public class MochaDecorator extends CondimentsDecorator {
	
	Beverage beverage;
	
	public MochaDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

}
