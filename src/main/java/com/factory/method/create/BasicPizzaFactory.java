package com.factory.method.create;

import com.factory.method.Pizza;
import com.factory.method.TypePizza;

public abstract class BasicPizzaFactory {
	public abstract Pizza createPizza(TypePizza type);
}
