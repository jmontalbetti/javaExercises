package PrimerosEjercicios;

public class Fraccion {
    private int numerador1;
    private int denominador1;
    private int numerador2;
    private int denominador2;
    private int numerador;
    private int denominador;

    public int getNumerador1() { return numerador1; }
    public void setNumerador1(int numerador1) { numerador1 = numerador1; }
    public int getDenominador1() { return denominador1; }
    public void setDenominador1(int denominador1) { denominador1 = denominador1; }

    public int getNumerador2() { return numerador2; }
    public void setNumerador2(int numerador2) { numerador2 = numerador2; }
    public int getDenominador2() { return denominador2; }
    public void setDenominador2(int denominador2) { denominador2 = denominador2; }

    public double Sumar() {
        this.numerador = this.numerador1 * this.denominador2 + this.numerador2 * this.denominador1;
        this.denominador = this.denominador1 * this.denominador2;
        simplificar();
        System.out.println(Numero1ToString() + " + " + Numero2ToString() + " = " + ResultToString());
        return this.numerador / this.denominador;
    }

    private String ResultToString() {
        String result = this.denominador == 1 ? String.valueOf(this.numerador) : this.numerador + "/" + this.denominador;
        return result;
    }

    private String Numero1ToString() {
        String numero1 = this.denominador1 == 1 ? String.valueOf(this.numerador1) : this.numerador1 + "/" + this.denominador1;
        return numero1;
    }

    private String Numero2ToString() {
        String numero2 = this.denominador2 == 1 ? String.valueOf(this.numerador2) : this.numerador2 + "/" + this.denominador2;
        return numero2;
    }

    public double Restar() {
        this.numerador = this.numerador1 * this.denominador2 - this.numerador2 * this.denominador1;
        this.denominador = this.denominador1 * this.denominador2;
        simplificar();
        System.out.println(Numero1ToString() + " - " + Numero2ToString() + " = " + ResultToString());
        return this.numerador / this.denominador;
    }

    public double Multiplicar() {
        this.numerador = this.numerador1 * this.numerador2;
        this.denominador = this.denominador1 * this.denominador2;;
        simplificar();
        System.out.println(Numero1ToString() + " * " + Numero2ToString() + " = " + ResultToString());
        return this.numerador / this.denominador;
    }

    public double Dividir() {
        if (this.numerador2 > 0) {
            this.numerador = this.numerador1 * this.denominador2;
            this.denominador = this.denominador1 * this.numerador2;
            simplificar();
            System.out.println(Numero1ToString() + " / " + Numero2ToString() + " = " + ResultToString());
            return numerador / denominador;
        }
        else
            System.out.println(Numero1ToString() + " / " + Numero2ToString() + " = NaN");
            return Double.NaN;
    }

    private void simplificar() {
        int[] digits = { 2, 3, 5, 7, 11, 13 };
        boolean noMoreDivisors = false;
        boolean oneDivisor = false;
        while(noMoreDivisors) {
            for (int digit : digits) {
                if(areDivisible(this.numerador, this.denominador, digit))
                {
                    this.numerador = this.numerador / digit;
                    this.denominador = this.denominador / digit;
                    oneDivisor = true;
                    break;
                }
            }
            if (!oneDivisor) noMoreDivisors = true;
        }
    }

    private boolean areDivisible(int number1, int number2, int digit) {
        return (number1 % digit) == 0 && (number2 % digit) == 0;
    }
}
