package com.factory.method;

import java.util.ArrayList;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		this.typePizza = TypePizza.Cheese;
	}

	@Override
	public void addIngredients() {
		this.ingredients = new ArrayList<>();
		this.ingredients.add(Ingredient.Tomate);
		this.ingredients.add(Ingredient.Cheese);
	}
}
