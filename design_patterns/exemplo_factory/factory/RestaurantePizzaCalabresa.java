package javaFunctions.design_patterns.exemplo_factory.factory;

import javaFunctions.design_patterns.exemplo_factory.product.Pizza;
import javaFunctions.design_patterns.exemplo_factory.product.PizzaCalabresa;

public class RestaurantePizzaCalabresa extends Restaurante {
    @Override
    public Pizza prepararPizza() {
        return new PizzaCalabresa();
    }
}