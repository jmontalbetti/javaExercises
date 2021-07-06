package TT3;

import java.util.Comparator;

public class QuickSort<T> implements ISorter<T> {
    @Override
    public void sort(T[] arr, Comparator<T> comparator) {
        quickSort(arr, 0, arr.length -1, comparator);
    }

    private <T> void quickSort(T[] arr, int izq, int der, Comparator<T> c) {
        T pivote=arr[izq];
        int i=izq;
        int j=der;
        T aux;
        while(i < j) {
            while(c.compare(arr[i], pivote) <= 0 && i < j) i++;
            while(c.compare(arr[j], pivote) > 0) j--;
            if (i < j) {
                aux= arr[i];
                arr[i]=arr[j];
                arr[j]=aux;
            }
        }
        arr[izq]=arr[j];
        arr[j]=pivote;
        if(izq < j-1)
            quickSort(arr,izq,j-1, c);
        if(j+1 < der)
            quickSort(arr,j+1,der, c);
    }
}
