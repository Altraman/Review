package broker;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class America extends Country {
    @Override
    public void getMessage(String message) {
        System.out.println("美国获取信息:" + message);
    }
}
