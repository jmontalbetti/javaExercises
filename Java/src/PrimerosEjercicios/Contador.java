package PrimerosEjercicios;

public class Contador {
    private int number;

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public Contador() { }

    public Contador(int number) {
        this();
        this.number = number;
    }

    public Contador(Contador contador) {
        this.number = contador.number;
    }

    public void incrementar() {
        this.number++;
    }

    public void decrementar() {
        this.number--;
    }
}
