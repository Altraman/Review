package appearance;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final EncryptFacade facade = new EncryptFacade();
        facade.fileEncrypt("facade/src.txt", "facade/des.txt");
    }
}
