package lterator;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class MyIterator implements AbstractIterator {
    private String[] productsName;
    private int index1;
    private int index2;

    public MyIterator(AbstractProductList list) {
        productsName = list.getProductsName();
        index1 = 0;
        index2 = productsName.length - 1;
    }

    @Override
    public void next() {
        if (index1 < productsName.length) {
            index1++;
        }
    }

    @Override
    public boolean isLast() {
        return index1 == productsName.length;
    }

    @Override
    public void previous() {
        if (index2 > -1) {
            index2--;
        }
    }

    @Override
    public boolean isFirst() {
        return index2 == -1;
    }

    @Override
    public String getNextItem() {
        return productsName[index1];
    }

    @Override
    public String getPreviousItem() {
        return productsName[index2];
    }
}
