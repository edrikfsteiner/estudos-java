package javaFunctions.design_patterns.exemplo_factory.product;

public class PizzaFrango implements Pizza {
    final String borda = "Catupiry";
    final String cobertura = "Frango";
    final String tempeiro = "Orégano";

    @Override
    public String toString() {
        return "PizzaFrango{" +
            "borda='" + borda + '\'' +
            ", cobertura='" + cobertura + '\'' +
            ", tempeiro='" + tempeiro + '\'' +
            '}';
    }
}