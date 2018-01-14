package decoration;

/**
 * Created by HuQiang on 2018/1/8.
 */
public abstract class WindowDecorator extends Window {
    private Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void display() {
        window.display();
    }
}
