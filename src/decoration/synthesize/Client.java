package decoration.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final Component simpleComponent = new TextView();
        final Component scrollbar = new ScrollbarDecorator(simpleComponent);
        final Component blackBorder = new BlackBorderDecorator(scrollbar);

        blackBorder.display();

        System.out.println("--------");
        scrollbar.display();
    }
}
