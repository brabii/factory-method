package com.factory.method;

import java.util.List;

public abstract class Pizza {
	protected TypePizza typePizza;
	protected List<Ingredient> ingredients;

	public abstract void addIngredients();

	public void preparePizza() {
		System.out.println("Pizza of type " + this.typePizza + "is under preparing...");
	}

	public TypePizza getTypePizza() {
		return typePizza;
	}

	public void setTypePizza(TypePizza typePizza) {
		this.typePizza = typePizza;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Pizza [typePizza=" + typePizza + ", ingredients=" + ingredients + "]";
	}
}
