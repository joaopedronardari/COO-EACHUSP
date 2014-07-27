package main;

import decorators.MochaDecorator;
import decorators.WhipDecorator;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Expresso();
		printCost(beverage);
		Beverage beverage2 = new HouseBlend();
		//beverage2 = new MochaDecorator(beverage2);
		beverage2 = new WhipDecorator(beverage2);
		beverage2 = new WhipDecorator(beverage2);
		beverage2 = new WhipDecorator(beverage2);
		
		printCost(beverage2);
	}
	
	public static void printCost(Beverage beverage) {
		System.out.println(beverage.getDescription() + " -- $ " + beverage.cost());
	}

}
