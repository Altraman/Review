package proxy;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class BusinessClass implements AbstractLog {
    @Override
    public void method() {
        System.out.println("真实业务方法");
    }
}
