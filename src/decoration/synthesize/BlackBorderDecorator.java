package decoration.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class BlackBorderDecorator extends Decorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }

    private void setBlackBorder() {
        System.out.println("设置了黑色边框");
    }
}
