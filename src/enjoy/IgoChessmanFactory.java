package enjoy;

import java.util.Hashtable;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class IgoChessmanFactory {
    private static final IgoChessmanFactory INSTANCE = new IgoChessmanFactory();
    private static Hashtable<String, IgoChessman> HASH_TABLE;

    public IgoChessmanFactory() {
        HASH_TABLE = new Hashtable<>();
        final IgoChessman black = new BlackIgoChessman();
        final IgoChessman white = new WhiteIgoChessman();
        HASH_TABLE.put("b", black);
        HASH_TABLE.put("w", white);
    }

    public static IgoChessmanFactory getInstance() {
        return INSTANCE;
    }

    public final IgoChessman getIgoChessman(String color) {
        return HASH_TABLE.get(color);
    }
}
