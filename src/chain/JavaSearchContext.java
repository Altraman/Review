package chain;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class JavaSearchContext extends SearchContext {
    @Override
    public void search(String keyword) {
        if (keyword.contains("Java")) {
            System.out.println("查询关键字Java");
        } else {
            searchContext.search(keyword);
        }
    }
}
