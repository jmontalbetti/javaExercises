package TT3;

import java.util.Comparator;

public class HeapSort<T> implements ISorter<T> {

    private static int node;
    private static int heapSize;
    private static int left;
    private static int right;

    public void sort(T[] arr, Comparator<T> comparator) {
        buildHeap(arr, comparator);
        T temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapSize--;
            heapify(arr, 0, comparator);
        }
    }

    private void buildHeap(T[] array, Comparator comp) {
        heapSize = array.length;
        for (int i = (int) Math.floor((array.length) / 2) - 1; i >= 0; i--) {
            heapify(array, i, comp);
        }
    }

    private void heapify(T[] array, int i, Comparator comp) {
        left = getLeft(i);
        right = getRight(i);
        node = ((left <= heapSize - 1) && (comp.compare(array[left], array[i]) > 0))
                ? left
                : i;
        if ((right <= heapSize - 1) && (comp.compare(array[right], array[node]) > 0)) {
            node = right;
        }
        if (node != i) {
            T temp = array[i];
            array[i] = array[node];
            array[node] = temp;
            heapify(array, node, comp);
        }
    }

    private int getLeft(int i) {
        return (i * 2);
    }

    private int getRight(int i) {
        return (i * 2 + 1);
    }
}
