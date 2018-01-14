package adapter.classadapter;

import adapter.DataOperation;
import adapter.QuickSort;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class QuickSortAdapter extends QuickSort implements DataOperation {
    @Override
    public int[] sort(int[] array) {
        return quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return 0;
    }
}
