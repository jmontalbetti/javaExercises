import TT3.*;

import java.time.LocalDateTime;

public class Exercises {

    public static void main(String[] args) throws Exception {
        /*
//Clase 1
exercise1();
exercise2();
exercise3();
exercise4();
exercise5();
exercise1B();
exercise2B();
exercise3B();
exercise4B();

//Clase 2
int[] initialArr = { 16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8 };
String[] orderedArray = radixSort(initialArr);
for(String i:orderedArray) {
    System.out.println(Integer.valueOf(i));
}

IPrecedable<Persona>[] listPersonas = new IPrecedable[] {
        new Persona("Maria", 123),
        new Persona("Luis", 2332),
        new Persona("Antonieta", 101)};

SortUtils.print(listPersonas);
SortUtils.order(listPersonas);
System.out.println("Ordenado");
SortUtils.print(listPersonas);

IPrecedable<Celular>[] listCelulares = new IPrecedable[] {
        new Celular(1233445, "Maria"),
        new Celular(5334002, "Luis"),
        new Celular(3422941, "Antonieta")
};
System.out.println("---------------------");

SortUtils.print(listCelulares);
SortUtils.order(listCelulares);
System.out.println("Ordenado");
SortUtils.print(listCelulares);

Integer[] intList = {4, 7, 3, 2, 8, 1, 5, 6};
QuickSort<Integer> quickSorter = new QuickSort<Integer>();
quickSorter.sort(intList, Integer::compareTo);
System.out.println(Arrays.toString(intList));

Integer[] intList = {4, 7, 3, 2, 8, 1, 5, 6};
HeapSort<Integer> heapSorter = new HeapSort<Integer>();
heapSorter.sort(intList, Integer::compareTo);
System.out.println(Arrays.toString(intList));

Integer[] intList = {4, 7, 3, 2, 8, 1, 5, 6};
BubbleSort<Integer> bubbleSorter = new BubbleSort<Integer>();
bubbleSorter.sort(intList, Integer::compareTo);
System.out.println(Arrays.toString(intList));

Integer[] intList = {4, 7, 3, 2, 8, 1, 5, 6};
ISorter<Integer> instanceI = MiFactory.getInstance();
instanceI.sort(intList, Comparator.comparingInt(x -> x));
System.out.println(Arrays.toString(intList));

String[] stringList = {"Alfa", "Gamma", "Etha", "Theta", "Delta"};
ISorter<String> instanceS = MiFactory.getInstance();
instanceS.sort(stringList, Comparator.comparing(x -> x));
System.out.println(Arrays.toString(stringList));
*/

        Time tiempo = new Time();
        Integer tamanio = 100000;
        Integer[] array = new Integer[tamanio];
        for(int i = 0; i < tamanio; i++)
            array[i] = (int) (Math.random() * (tamanio +1));

        tiempo.setStart(LocalDateTime.now());
        QuickSort<Integer> quickSorter = new QuickSort<>();
        quickSorter.sort(array, Integer::compareTo);
        tiempo.setStop(LocalDateTime.now());
        System.out.println("Quicksort: " + tiempo.elapsedTime());

        for(int i = 0; i < tamanio; i++)
            array[i] = (int) (Math.random() * (tamanio +1));
        tiempo.setStart(LocalDateTime.now());
        HeapSort<Integer> heapSorter = new HeapSort<>();
        heapSorter.sort(array, Integer::compareTo);
        tiempo.setStop(LocalDateTime.now());
        System.out.println("Heapsort: " + tiempo.elapsedTime());

        for(int i = 0; i < tamanio; i++)
            array[i] = (int) (Math.random() * (tamanio +1));
        tiempo.setStart(LocalDateTime.now());
        BubbleSort<Integer> bubbleSorter = new BubbleSort<>();
        bubbleSorter.sort(array, Integer::compareTo);
        tiempo.setStop(LocalDateTime.now());
        System.out.println("Bubblesort: " + tiempo.elapsedTime());
    }
    /*
//Clase 2
public static String[] radixSort(int[] integerArray) {
int maxStringLength = arrayMaxLength(integerArray);
String[] stringArray = convertArrayToString(integerArray, maxStringLength);
for(int digitPosition = maxStringLength - 1; digitPosition >= 0 ; digitPosition--) {
    String[][] digitArray = orderIntoDigitArray(stringArray, integerArray, digitPosition);
    stringArray = resetArray(integerArray, digitArray);
}
return stringArray;
}

private static String[][] orderIntoDigitArray(String[] stringArray, int[] integerArray, int position) {
String[][] digitArray = new String[10][integerArray.length];
for (String s : stringArray) {
    int indexDigit = Integer.parseInt(s.substring(position, position + 1));
    int indexIntoDigit = notEmptyLength(digitArray[indexDigit]);
    digitArray[indexDigit][indexIntoDigit] = s;
}
return digitArray;
}

private static String[] resetArray(int[] integerArray, String[][] digitArray) {
String[] stringArray = new String[integerArray.length];
int counter = 0;
for(int digit = 0; digit < 10; digit++) {
    int indexIntoDigit = 0;
    while (digitArray[digit][indexIntoDigit] != null) {
        stringArray[counter] = digitArray[digit][indexIntoDigit];
        indexIntoDigit++;
        counter++;
    }
}
return stringArray;
}

private static String[] convertArrayToString(int[] arr, int maxLength) {
String[] sArr = new String[arr.length];
for(int i = 0; i < arr.length; i++) {
    sArr[i] = StringUtils.lPad(String.valueOf(arr[i]), '0', maxLength);
}
return sArr;
}

public static int arrayMaxLength(int[] arr) {
int maxLength = 0;
for (int j : arr) {
    int numberLength = String.valueOf(j).length();
    if (numberLength > maxLength)
        maxLength = numberLength;
}
return maxLength;
}

private static int notEmptyLength(Object[] array) {
int count = 0;
for (Object obj : array) {
    if (obj != null && obj != "" )
        count++;
}
return count;
}

//Clase 1
public static void exercise1() {
Scanner scanner = new Scanner(System.in);
System.out.println("Ingresar cantidad de números pares");
int oddQuantity = scanner.nextInt();
for (int i = 0; i < oddQuantity; i++) {
    System.out.println(i * 2);
}
}

public static void exercise2() {
Scanner scanner = new Scanner(System.in);
System.out.println("Ingresar número");
int number = scanner.nextInt();
System.out.println("Ingresar cantidad de múltiplos");
int multiplesQuantity = scanner.nextInt();
for (int i = 1; i <= multiplesQuantity; i++) {
    System.out.println(i * number);
}
}

public static void exercise3() {
Scanner scanner = new Scanner(System.in);
System.out.println("Ingresar número");
int number = scanner.nextInt();
if (isPrimeNumber(number))
    System.out.println("El número: " + number + " es primo");
else
    System.out.println("El número: " + number + " no es primo");
}

private static boolean isPrimeNumber(int number) {
boolean flag = true;
for (int i = 2; i <= number / 2; ++i) {
    if (number % i == 0) {
        flag = false;
        break;
    }
}
return flag;
}

public static void exercise4() {
Scanner scanner = new Scanner(System.in);
System.out.println("Ingresar cantidad de números primos");
int primeNumbersCounter = scanner.nextInt();
var counter = 0;
var number = 0;
while (counter < primeNumbersCounter) {
    number++;
    if (isPrimeNumber(number)) {
        System.out.println(number);
        counter++;
    }
}
}

public static void exercise5() {
Scanner scanner = new Scanner(System.in);
System.out.println("Ingresar cantidad de números");
int numberCounter = scanner.nextInt();
System.out.println("Ingresar cantidad de repeticiones");
int repetitionQuantity = scanner.nextInt();
System.out.println("Ingresar el dígito repetido");
int repeatedDigit = scanner.nextInt();
int counter = 0;
int number = 0;
while (counter < numberCounter) {
    number++;
    if (containsRepetitionQuantity(number, repetitionQuantity, repeatedDigit)) {
        System.out.println(number);
        counter++;
    }
}
}

private static boolean containsRepetitionQuantity(int number, int repetitionQuantity, int repeatedDigit) {
int count = String.valueOf(number).length() - String.valueOf(number).replaceAll(String.valueOf(repeatedDigit), "").length();
return count == repetitionQuantity;
}

public static void exercise1B() {
int number1 = 10;
int number2 = 5;
System.out.println("La suma es " + number1 + number2);
System.out.println("La resta es " + (number1 - number2));
System.out.println("La multiplicación es " + (number1 * number2));
if (number2 != 0)
    System.out.println("La división es " + (number1 / number2));
else
    System.out.println("No se puede dividir por 0");
}

public static void exercise2B() {
String name = "Javier";
System.out.println("Bienvenido, " + name);
}

public static void exercise3B() {
Scanner scanner = new Scanner(System.in);
System.out.println("Ingresar radio");
String stringRadius = scanner.next();
System.out.println("El área del círculo es " + Math.PI * Math.pow(Double.parseDouble(stringRadius), 2));
}

public static void exercise4B() {
Scanner scanner = new Scanner(System.in);
System.out.println("Ingresar número");
int number = scanner.nextInt();
boolean isOdd = number % 2 == 0;
if (isOdd)
    System.out.println("El numero es par");
else
    System.out.println("El numero es impar");
}
*/
}

