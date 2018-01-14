package lterator;

/**
 * Created by HuQiang on 2018/1/8.
 */
public interface AbstractIterator {
    void next();

    boolean isLast();

    void previous();

    boolean isFirst();

    String getNextItem();

    String getPreviousItem();
}
