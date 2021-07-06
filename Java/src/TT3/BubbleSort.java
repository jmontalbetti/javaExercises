package TT3;

import java.util.Comparator;

public class BubbleSort<T> implements ISorter<T> {
    @Override
    public void sort(T[] arr, Comparator<T> comparator) {
        T temp;
        for(int i=0; i < arr.length; i++) {
            for(int j=1; j < (arr.length-i); j++) {
                if(comparator.compare(arr[j-1], arr[j]) > 0) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}
