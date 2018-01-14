package adapter.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class ConcreteCat implements Cat {
    @Override
    public void cry() {
        System.out.println("猫哭");
    }

    @Override
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
