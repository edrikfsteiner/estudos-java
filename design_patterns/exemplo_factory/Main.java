package javaFunctions.design_patterns.exemplo_factory;

import javaFunctions.design_patterns.exemplo_factory.factory.Restaurante;
import javaFunctions.design_patterns.exemplo_factory.factory.RestaurantePizzaCalabresa;
import javaFunctions.design_patterns.exemplo_factory.factory.RestaurantePizzaFrango;
import javaFunctions.design_patterns.exemplo_factory.product.Pizza;

import java.util.Scanner;

public class Main {
    private static Restaurante restaurante;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pizzaEscolhida = scanner.nextLine();

        switch (pizzaEscolhida.toLowerCase()) {
            case "calabresa":
                restaurante = new RestaurantePizzaCalabresa();
                break;

            case "frango":
                restaurante = new RestaurantePizzaFrango();
                break;

            default:
                System.out.println("Pizza não existente");
        }

        Pizza pizza = restaurante.pedirPizza();
        System.out.println(pizza);
    }
}