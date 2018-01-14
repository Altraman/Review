package enjoy.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class SharedString {
    private Color mColor;
    private Size mSize;
    private String mContent;

    public SharedString(String mContent) {
        this.mContent = mContent;
    }

    public void setColor(Color mColor) {
        this.mColor = mColor;
    }

    public void setSize(Size mSize) {
        this.mSize = mSize;
    }

    public final void display() {
        System.out.println(mContent + " " + mColor.getColor() + " " + mSize.getValue());
    }
}
