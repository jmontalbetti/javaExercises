package TT3;

import java.util.Comparator;

public interface ISorter<T> {
    void sort(T arr[], Comparator<T> comparator);
}
