package decoration;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class ScrollbarDecorator extends WindowDecorator {
    public ScrollbarDecorator(Window window) {
        super(window);
    }

    @Override
    public void display() {
        setScrollbar();
        super.display();
    }

    private void setScrollbar() {
        System.out.println("添加了Scrollbar");
    }
}
