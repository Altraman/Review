package chain;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final SearchContext javaSearch = new JavaSearchContext();
        final SearchContext sqlSearch = new SqlSearchContext();
        final SearchContext umlSearch = new UmlSearchContext();

        javaSearch.setSearchContext(sqlSearch);
        sqlSearch.setSearchContext(umlSearch);
        final String keyword = "Uml类图";
        javaSearch.search(keyword);
    }
}
