package javaFunctions.design_patterns.exemplo_builder.aviao;

import javaFunctions.design_patterns.exemplo_builder.components.Motor;

public class Aviao {
    private final TipoAviao tipo;
    private final Motor motor;
    private final double asa;
    private final boolean armas;
    private final int assentos;

    public Aviao(TipoAviao tipo, Motor motor, double asa, boolean armas, int assentos) {
        this.tipo = tipo;
        this.motor = motor;
        this.asa = asa;
        this.armas = armas;
        this.assentos = assentos;
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