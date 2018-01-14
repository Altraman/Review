package adapter.classadapter;

import adapter.DataOperation;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final DataOperation quickSort = new QuickSortAdapter();
        final DataOperation binarySearch = new BinarySearchAdapter();
        final int[] array = {13, 24, 15, 36, 26, 17, 68, 34};
        int[] result;
        int value;

        result = quickSort.sort(array);
        value = binarySearch.search(array, 24);
        for (int num : result) {
            System.out.println(num);
        }
        System.out.println(value);
    }
}
