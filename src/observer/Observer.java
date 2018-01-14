package observer;

/**
 * Created by HuQiang on 2018/1/9.
 */
public interface Observer {
    String getName();

    void setName(String name);

    void help();

    void beAttacked(Ally ally);
}
