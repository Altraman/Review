package enjoy;

/**
 * Created by HuQiang on 2018/1/8.
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void locate(Coordinates coordinates) {
        System.out.println("棋子的颜色" + getColor() + "，棋子位置:" + coordinates.getX() + "," + coordinates.getY());
    }
}
