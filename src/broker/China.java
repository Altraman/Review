package broker;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class China extends Country {
    @Override
    public void getMessage(String message) {
        System.out.println("中国获取信息:" + message);
    }
}
