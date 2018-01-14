package broker;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final WTO wto = new WTO();
        final China china = new China();
        final America america = new America();

        china.setUn(wto);
        america.setUn(wto);
        wto.setChina(china);
        wto.setAmerica(america);

        china.declare("中国是一个好国家");
        america.declare("美国将会为世界和平作出贡献");
    }
}
