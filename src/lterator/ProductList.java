package lterator;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class ProductList extends AbstractProductList {
    public ProductList(String[] productsName) {
        super(productsName);
    }

    @Override
    public AbstractIterator getIterator() {
        return new MyIterator(this);
    }
}
