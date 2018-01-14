package adapter.object;

import adapter.BinarySearch;
import adapter.DataOperation;
import adapter.QuickSort;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class ObjectAdapter implements DataOperation {
    private final QuickSort QUICK_SORT;
    private final BinarySearch BINARY_SEARCH;

    public ObjectAdapter(QuickSort quick_sort, BinarySearch binary_search) {
        this.QUICK_SORT = quick_sort;
        this.BINARY_SEARCH = binary_search;
    }

    @Override
    public int[] sort(int[] array) {
        return QUICK_SORT.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return BINARY_SEARCH.binarySearch(array, key);
    }
}
