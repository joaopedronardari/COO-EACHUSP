package decorators;

import main.Beverage;
import main.CondimentsDecorator;

public class SoyDecorator extends CondimentsDecorator {

	Beverage beverage;
	
	public SoyDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}

}
