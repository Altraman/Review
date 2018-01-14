package chain;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class SqlSearchContext extends SearchContext {
    @Override
    public void search(String keyword) {
        if (keyword.contains("Sql")) {
            System.out.println("查询关键字Sql");
        } else {
            searchContext.search(keyword);
        }
    }
}
