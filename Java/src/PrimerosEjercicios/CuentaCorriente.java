package PrimerosEjercicios;

public class CuentaCorriente {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public int getAccountNumber() { return accountNumber; }
    public void setAccountNumber(int numero) { this.accountNumber = numero; }

    public String getAccountHolderName() { return accountHolderName; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public CuentaCorriente() { }

    public CuentaCorriente(String accountHolderName, double balance) {
        this();
        this.accountNumber++;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente) {
        this();
        this.accountNumber = cuentaCorriente.accountNumber;
        this.accountHolderName = cuentaCorriente.accountHolderName;
        this.balance = cuentaCorriente.balance;
    }

    public void ingreso(double monto) {
        this.balance += monto;
    }

    public void egreso(double monto) {
        this.balance -= monto;
    }

    public void reintegro(CuentaCorriente cuentaCorriente, double monto) {
        this.balance += monto;
        cuentaCorriente.balance -= balance;
    }

    public void transferencia(CuentaCorriente cuentaCorriente, double monto) {
        this.balance -= monto;
        cuentaCorriente.balance += balance;
    }
}
