package com.factory.method;

import java.util.ArrayList;

public class VergiePizza extends Pizza {

	public VergiePizza() {
		this.typePizza = TypePizza.Vergie;
	}

	@Override
	public void addIngredients() {
		this.ingredients = new ArrayList<>();
		this.ingredients.add(Ingredient.Tomate);
		this.ingredients.add(Ingredient.Vergie);
	}
}
