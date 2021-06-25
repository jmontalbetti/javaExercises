import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();
        if (EsDivisiblePorDos(number))
            System.out.println("Es divisible por dos");
        else
            System.out.println("No es dividible por dos");
    }

    public static boolean EsDivisiblePorDos(int number) {
        return number % 2 == 0;
    }
}
