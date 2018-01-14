package lterator;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final String[] pNames = {"ThinkPad", "iPhone", "Lv"};
        final AbstractProductList list = new ProductList(pNames);
        final AbstractIterator iterator = list.getIterator();
        while (!iterator.isLast()) {
            System.out.println(iterator.getNextItem());
            iterator.next();
        }
        System.out.println("----------");
        while (!iterator.isFirst()) {
            System.out.println(iterator.getPreviousItem());
            iterator.previous();
        }
    }
}
