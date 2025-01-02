package javaFunctions.design_patterns.exemplo_factory.product;

public class PizzaCalabresa implements Pizza {
    final String borda = "Normal";
    final String cobertura = "Calabresa";
    final String tempeiro = "Molho de tomate";

    @Override
    public String toString() {
        return "PizzaCalabresa{" +
            "borda='" + borda + '\'' +
            ", cobertura='" + cobertura + '\'' +
            ", tempeiro='" + tempeiro + '\'' +
            '}';
    }
}