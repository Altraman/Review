package decoration.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class ScrollbarDecorator extends Decorator {
    public ScrollbarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setScrollbar();
        super.display();
    }

    private void setScrollbar() {
        System.out.println("设置滚动条");
    }
}
