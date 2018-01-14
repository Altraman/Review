package proxy.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final Subject proxy = new Picture();
        proxy.run();
    }
}
