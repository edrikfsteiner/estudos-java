package javaFunctions.design_patterns.exemplo_builder.director;

import javaFunctions.design_patterns.exemplo_builder.aviao.TipoAviao;
import javaFunctions.design_patterns.exemplo_builder.builder.Builder;
import javaFunctions.design_patterns.exemplo_builder.components.Motor;

public class Director {
    public void buildAviaoCarga(Builder builder) {
        builder.setTipoAviao(TipoAviao.CARGA);
        builder.setMotor(new Motor(6600, 4600));
        builder.setAsa(40);
        builder.setArmas(false);
        builder.setAssentos(20);
    }

    public void buildAviaoCivil(Builder builder) {
        builder.setTipoAviao(TipoAviao.CIVIL);
        builder.setMotor(new Motor(60000, 55000));
        builder.setAsa(35);
        builder.setArmas(false);
        builder.setAssentos(180);
    }

    public void buildAviaoJato(Builder builder) {
        builder.setTipoAviao(TipoAviao.JATO);
        builder.setMotor(new Motor(80000, 100000));
        builder.setAsa(12);
        builder.setArmas(false);
        builder.setAssentos(1);
    }
}