package javaFunctions.design_patterns.exemplo_builder;

import javaFunctions.design_patterns.exemplo_builder.aviao.Aviao;
import javaFunctions.design_patterns.exemplo_builder.builder.AviaoBuilder;
import javaFunctions.design_patterns.exemplo_builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        AviaoBuilder builderCarga = new AviaoBuilder();
        director.buildAviaoCarga(builderCarga);
        AviaoBuilder builderCivil = new AviaoBuilder();
        director.buildAviaoCivil(builderCivil);
        AviaoBuilder builderJato = new AviaoBuilder();
        director.buildAviaoJato(builderJato);

        Aviao aviaoCarga = builderCarga.getAviao();
        System.out.println("Avião construído:\n" + aviaoCarga.getTipo());
        Aviao aviaoCivil = builderCivil.getAviao();
        System.out.println("Avião construído:\n" + aviaoCivil.getTipo());
        Aviao aviaoJato = builderJato.getAviao();
        System.out.println("Avião construído:\n" + aviaoJato.getTipo());
    }
}