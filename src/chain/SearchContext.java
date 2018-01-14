package chain;

/**
 * Created by HuQiang on 2018/1/8.
 */
public abstract class SearchContext {
    protected SearchContext searchContext;

    public void setSearchContext(SearchContext searchContext) {
        this.searchContext = searchContext;
    }

    public abstract void search(String keyword);
}
