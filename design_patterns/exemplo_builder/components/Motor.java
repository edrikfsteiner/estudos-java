package javaFunctions.design_patterns.exemplo_builder.components;

public class Motor {
    private final double torque;
    private final double potencia;
    private boolean ligado;

    public Motor(double torque, double potencia) {
        this.torque = torque;
        this.potencia = potencia;
    }

    public void on() {
        ligado = true;
    }

    public void off() {
        ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public double getTorque() {
        return torque;
    }

    public double getPotencia() {
        return potencia;
    }
}