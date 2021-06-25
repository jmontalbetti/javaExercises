import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
        Exercise1B();
        Exercise2B();
        Exercise3B();
        Exercise4B();
    }

    public static void Exercise1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar cantidad de numeros pares");
        int oddQuantity = scanner.nextInt();
        for (int i = 0; i < oddQuantity; i++){
            System.out.println(i*2);
        }
    }

    public static void Exercise2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar number");
        int number = scanner.nextInt();
        System.out.println("Ingresar cantidad de multiplos");
        int multiplesQuantity = scanner.nextInt();
        for(int i = 1; i<= multiplesQuantity; i++){
            System.out.println(i*number);
        }
    }

    public static void Exercise3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar numero");
        int number = scanner.nextInt();
        if(IsPrimeNumber(number))
            System.out.println("El numero: " + number + " es primo");
        else
            System.out.println("El numero: " + number + " no es primo");
    }

    private static boolean IsPrimeNumber(int number) {
        boolean flag = true;
        for (int i = 2; i <= number / 2; ++i){
            if (number % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void Exercise4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar cantidad de números primos");
        int primeNumbersCounter = scanner.nextInt();
        var counter = 0;
        var number = 0;
        while (counter < primeNumbersCounter) {
            number++;
            if (IsPrimeNumber(number)) {
                System.out.println(number);
                counter++;
            }
        }
    }

    public static void Exercise5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar cantidad de números");
        int numberCounter = scanner.nextInt();
        System.out.println("Ingresar cantidad de repeticiones");
        int repetitionQuantity = scanner.nextInt();
        System.out.println("Ingresar el digito repetido");
        int repeatedDigit = scanner.nextInt();
        int counter = 0;
        int number = 0;
        while(counter < numberCounter) {
            number++;
            if (ContainsRepetitionQuantity(number, repetitionQuantity, repeatedDigit)) {
                System.out.println(number);
                counter++;
            }
        }
    }

    private static boolean ContainsRepetitionQuantity(int number, int repetitionQuantity, int repeatedDigit) {
        int count = String.valueOf(number).length() - String.valueOf(number).replaceAll(String.valueOf(repeatedDigit),"").length();
        return count == repetitionQuantity;
    }

    public static void Exercise1B() {
        int number1 = 10;
        int number2 = 5;
        System.out.println("La suma es " + number1 + number2);
        System.out.println("La resta es " + (number1 - number2));
        System.out.println("La multiplicacion es " + (number1 * number2));
        if (number2 != 0)
            System.out.println("La division es " + (number1 / number2));
        else
            System.out.println("No se puede dividir por 0");
    }

    public static void Exercise2B() {
        String name = "Javier";
        System.out.println("Bienvenido, " + name);
    }

    public static void Exercise3B() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el radio");
        String stringRadius = scanner.next();
        System.out.println("El area del circulo es " + Math.PI * Math.pow(Double.parseDouble(stringRadius), 2));
    }

    public static void Exercise4B() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el numero");
        int number = scanner.nextInt();
        boolean isOdd = number % 2 == 0;
        if (isOdd)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
    }
}