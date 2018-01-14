package chain.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final Ami banZhang = new BanZhang("吕心泳");
        final Ami paiZhang = new PaiZhang("张定康");
        final Ami yingZhang = new YingZhang("方抒怀");

        banZhang.setAmiContext(paiZhang);
        paiZhang.setAmiContext(yingZhang);
        banZhang.handleRequest(new Mission("001", 20));
    }
}
