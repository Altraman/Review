package combination.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final Institution bj = new Institution("北京");
        final Institution hn = new Institution("湖南");
        final Institution cs = new Institution("长沙");
        final Institution xt = new Institution("湘潭");

        final Office office1 = new Office("北京教务办公室");
        final Office office2 = new Office("湖南教务办公室");
        final Office office3 = new Office("长沙教务办公室");
        final Office office4 = new Office("湘潭教务办公室");

        bj.add(office1);
        hn.add(office2);
        cs.add(office3);
        xt.add(office4);
        bj.handleArchives();
    }
}
