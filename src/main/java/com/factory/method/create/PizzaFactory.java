package com.factory.method.create;

import com.factory.method.CheesePizza;
import com.factory.method.PepporoniPizza;
import com.factory.method.Pizza;
import com.factory.method.TypePizza;
import com.factory.method.VergiePizza;

public class PizzaFactory extends BasicPizzaFactory {

	@Override
	public Pizza createPizza(TypePizza type) {
		Pizza pizza;
		switch (type) {
		case Cheese:
			pizza = new CheesePizza();
			break;
		case Pepporoni:
			pizza = new PepporoniPizza();
			break;
		case Vergie:
			pizza = new VergiePizza();
			break;

		default:
			throw new IllegalArgumentException("this pizza does'nt existe.");
		}
		pizza.preparePizza();
		pizza.addIngredients();
		return pizza;
	}

}
