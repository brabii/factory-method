package com.factory.method;

import java.util.ArrayList;

public class PepporoniPizza extends Pizza {

	public PepporoniPizza() {
		this.typePizza = TypePizza.Pepporoni;
	}

	@Override
	public void addIngredients() {
		this.ingredients = new ArrayList<>();
		this.ingredients.add(Ingredient.Tomate);
		this.ingredients.add(Ingredient.Pepporini);
	}
}
