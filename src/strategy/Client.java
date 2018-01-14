package strategy;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class Client {
    public static void main(String[] args) {
        final Cipher function1 = new CaesarCipher();
        final DataOperation operation = new DataOperation();
        operation.setCipher(function1);
        final String text = operation.doEncrypt(2312, "dasdasd");
        System.out.println(text);
    }
}
