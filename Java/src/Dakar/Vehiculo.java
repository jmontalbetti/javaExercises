package Dakar;

import java.util.Objects;

public abstract class Vehiculo {
    private double velocidad;
    private double aceleracion;
    private double anguloDeGiro;
    private String patente;
    private double peso;
    private int ruedas;

    public Vehiculo(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
    }

    public double getPuntaje() {
        return (this.velocidad * 0.5 * this.aceleracion) / (this.anguloDeGiro * (this.peso - this.ruedas * 100));
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(double anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (Objects.isNull(object)) return false;
        Vehiculo vehiculo = (Vehiculo)object;
        return this.patente.equals(vehiculo.getPatente()) &&
                Double.compare(this.velocidad, vehiculo.getVelocidad()) == 0 &&
                Double.compare(this.aceleracion, vehiculo.getAceleracion()) == 0 &&
                Double.compare(this.anguloDeGiro, vehiculo.getAnguloDeGiro()) == 0 &&
                Double.compare(this.peso, vehiculo.getPeso()) == 0 &&
                this.ruedas == vehiculo.getRuedas();
    }
}
