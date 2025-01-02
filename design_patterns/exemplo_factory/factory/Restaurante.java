package javaFunctions.design_patterns.exemplo_factory.factory;

import javaFunctions.design_patterns.exemplo_factory.product.Pizza;

public abstract class Restaurante {
    public Pizza pedirPizza() {
        return prepararPizza();
    }

    public abstract Pizza prepararPizza();
}