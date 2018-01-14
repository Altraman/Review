package lterator;

/**
 * Created by HuQiang on 2018/1/8.
 */
public abstract class AbstractProductList {
    private String[] productsName;

    public AbstractProductList(String[] productsName) {
        this.productsName = productsName;
    }

    public String[] getProductsName() {
        return productsName;
    }

    public abstract AbstractIterator getIterator();
}
