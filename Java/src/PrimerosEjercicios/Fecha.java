package PrimerosEjercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    enum Meses{
        JANUARY("Enero"), FEBRUARY("Febrero"), MARCH("Marzo"), APRIL("Abril"), MAY("Mayo"), JUNE("Junio"),
        JULY("JULIO"), AUGUST("Agosto"), SEPTEMBER("Septiembre"), OCTOBER("Octubre"), NOVEMBER("Noviembre"), DICEMBER("Diciembre");
        private String mes;

        Meses(String s) { mes = s ;}
        String getMes() { return mes; }
    }

    private GregorianCalendar fecha = new GregorianCalendar();

    public Fecha() { }

    public Fecha(int anio, int mes, int dia) {
        this();
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.fecha.set(anio, mes, dia);
    }

    public boolean isValidDate(int anio, int mes, int dia) {
        boolean valid = true;
        if (mes > 12 || mes < 1 || dia < 1)
            valid = false;
        else
            switch (mes) {
                case 2:
                    if (anio % 100 == 0 && anio % 400 == 0)
                        valid = dia <= 29;
                    else
                        valid = dia <= 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    valid = dia <= 30;
                    break;
                default:
                    valid = dia <= 31;
                    break;
            }
        return valid;
    }

    public void dateAdd() {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.add(calendar.DATE, 1);
        this.fecha = (GregorianCalendar) calendar;

    }

    public void addDay() {
        this.dia++;
        switch (this.mes) {
            case 2:
                if (this.anio % 100 == 0 && this.anio % 400 == 0) {
                    this.mes = this.dia > 29 ? this.mes++ : this.mes;
                    this.dia = this.dia > 29 ? this.dia + 1 : 1;
                }
                else {
                    this.mes = this.dia > 28 ? this.mes++ : this.mes;
                    this.dia = this.dia > 28 ? this.dia + 1 : 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                this.mes = this.dia > 30 ? this.mes++ : this.mes;
                this.dia = this.dia > 30 ? this.dia + 1 : 1;
                break;
            default:
                this.mes = this.dia > 31 ? this.mes++ : this.mes;
                this.dia = this.dia > 31 ? this.dia + 1 : 1;
                break;
        }
        this.anio = this.mes == 13 ? this.anio + 1 : this.anio;
        this.mes = this.mes == 13 ? 1 : this.mes;
        this.fecha.set(this.anio, this.mes, this.dia);
    }

    @Override
    public String toString() {
        int i = 0;
        String mesString = "";
        for (Meses m:Meses.values()) {
            if (i == this.mes)
            {
                mesString = m.getMes();
                break;
            }
            i++;
        }
        return this.dia + " de " + mesString + this.mes + " de " + this.anio;
    }
}
