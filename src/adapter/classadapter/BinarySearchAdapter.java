package adapter.classadapter;

import adapter.BinarySearch;
import adapter.DataOperation;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class BinarySearchAdapter extends BinarySearch implements DataOperation {
    @Override
    public int[] sort(int[] array) {
        return new int[0];
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch(array, key);
    }
}
