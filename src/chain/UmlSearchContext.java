package chain;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class UmlSearchContext extends SearchContext {
    @Override
    public void search(String keyword) {
        if (keyword.contains("Uml")) {
            System.out.println("查询关键字Uml");
        } else {
            searchContext.search(keyword);
        }
    }
}
