package enjoy;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final IgoChessman black1;
        final IgoChessman black2;
        final IgoChessman black3;
        final IgoChessman white1;
        final IgoChessman white2;

        final IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        System.out.println(black1 == black2);
        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        System.out.println(white1 == white2);

        black1.locate(new Coordinates(1, 2));
        black2.locate(new Coordinates(2, 3));
        black3.locate(new Coordinates(3, 4));
        white1.locate(new Coordinates(2, 5));
        white2.locate(new Coordinates(2, 4));
    }
}
