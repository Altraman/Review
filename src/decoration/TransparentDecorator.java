package decoration;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class TransparentDecorator extends WindowDecorator {
    public TransparentDecorator(Window window) {
        super(window);
    }

    @Override
    public void display() {
        setTransparent();
        super.display();
    }

    private void setTransparent() {
        System.out.println("将窗体设置为透明窗体");
    }
}
