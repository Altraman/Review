package adapter.object;

import adapter.BinarySearch;
import adapter.DataOperation;
import adapter.QuickSort;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final BinarySearch search = new BinarySearch();
        final QuickSort sort = new QuickSort();
        final DataOperation operation = new ObjectAdapter(sort, search);
        final int[] array = {13, 24, 15, 36, 26, 17, 68, 34};
        int[] result;
        int value;

        System.out.println("排序结果:");
        result = operation.sort(array);
        for (int i : result) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找关键字24：");
        value = operation.search(array, 24);
        if (value != -1) {
            System.out.println("找到关键字24");
        } else {
            System.out.println("未找到关键字24");
        }

        System.out.println("查找关键字25：");
        value = operation.search(array, 25);
        if (value != -1) {
            System.out.println("找到关键字25");
        } else {
            System.out.println("未找到关键字25");
        }
    }
}
