package visitor;

/**
 * Created by HuQiang on 2018/1/9.
 */
public interface Employee {
    void accept(Department handler);
}
