package Geometria;

public class Circulo extends FiguraGeometrica {
    private double radious;

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radious, 2);
    }
}
