package javaFunctions.design_patterns.exemplo_builder;

import javaFunctions.design_patterns.exemplo_builder.aviao.Aviao;
import javaFunctions.design_patterns.exemplo_builder.aviao.AviaoBuilder;
import javaFunctions.design_patterns.exemplo_builder.aviao.TipoAviao;

public class Main {
    public static void main(String[] args) {
        Aviao aviaoCarga = new AviaoBuilder().build(TipoAviao.CARGA);
        Aviao aviaoCivil = new AviaoBuilder().build(TipoAviao.CIVIL);
        Aviao aviaoJato = new AviaoBuilder().build(TipoAviao.JATO);

        System.out.println(aviaoCarga.getTipo());
        System.out.println(aviaoCivil.getTipo());
        System.out.println(aviaoJato.getTipo());
    }
}