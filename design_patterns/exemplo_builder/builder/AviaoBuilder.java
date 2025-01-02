package javaFunctions.design_patterns.exemplo_builder.builder;

import javaFunctions.design_patterns.exemplo_builder.aviao.Aviao;
import javaFunctions.design_patterns.exemplo_builder.aviao.TipoAviao;
import javaFunctions.design_patterns.exemplo_builder.components.Motor;

public class AviaoBuilder implements Builder {
    private TipoAviao tipo;
    private Motor motor;
    private double asa;
    private boolean armas;
    private int assentos;

    public Aviao getAviao() {
        return new Aviao(tipo, motor, asa, armas, assentos);
    }

    @Override
    public void setTipoAviao(TipoAviao tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setAsa(double asa) {
        this.asa = asa;
    }

    @Override
    public void setArmas(boolean armas) {
        this.armas = armas;
    }

    @Override
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
}