package javaFunctions.design_patterns.exemplo_builder.aviao;

import javaFunctions.design_patterns.exemplo_builder.components.Motor;

public class Aviao {
    private TipoAviao tipo;
    private Motor motor;
    private double asa;
    private boolean armas;
    private int assentos;

    public Aviao(AviaoBuilder builder) {
        this.tipo = builder.tipo;
        this.motor = builder.motor;
        this.asa = builder.asa;
        this.armas = builder.armas;
        this.assentos = builder.assentos;
    }

    public TipoAviao getTipo() {
        return tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public double getAsa() {
        return asa;
    }

    public boolean isArmas() {
        return armas;
    }

    public int getAssentos() {
        return assentos;
    }
}