package javaFunctions.design_patterns.exemplo_factory.factory;

import javaFunctions.design_patterns.exemplo_factory.product.Pizza;
import javaFunctions.design_patterns.exemplo_factory.product.PizzaCalabresa;
import javaFunctions.design_patterns.exemplo_factory.product.PizzaFrango;

public class RestauranteFactory {
    public Pizza prepararPizza(String ingrediente) {
        if (ingrediente.equals("calabresa")) {
            return new PizzaCalabresa();
        } else if (ingrediente.equals("frango")) {
            return new PizzaFrango();
        } else return null;
    }
}