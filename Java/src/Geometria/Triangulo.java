package Geometria;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double high;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    double area() {
        return base * high / 2;
    }
}
