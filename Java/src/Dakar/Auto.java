package Dakar;

public class Auto extends Vehiculo {

    public Auto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente);
        this.setRuedas(4);
        this.setPeso(1000);
    }
}
