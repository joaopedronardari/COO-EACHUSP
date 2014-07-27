package decorators;

import main.Beverage;
import main.CondimentsDecorator;

public class WhipDecorator extends CondimentsDecorator {

	Beverage beverage;
	
	public WhipDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.1 + beverage.cost();
	}

}
