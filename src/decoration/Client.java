package decoration;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final Window windowS = new SimpleWindow();
        final Window windowSB = new ScrollbarDecorator(windowS);
        final Window windowT = new TransparentDecorator(windowSB);

        windowT.display();
    }
}
