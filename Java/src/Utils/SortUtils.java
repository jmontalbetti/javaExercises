package Utils;

import Interfaces.IPrecedable;


public class SortUtils {
    public static <T> void order(IPrecedable<T>[] arr)  {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].precedeA((T) arr[j+1]) > 0) {
                    IPrecedable<T> aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    public static <T> void print(IPrecedable<T>[] arr) {
        for(int i=0; i <arr.length; i++) {
            System.out.println((T) arr[i]);
        }
    }
}
