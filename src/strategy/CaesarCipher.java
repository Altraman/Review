package strategy;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class CaesarCipher implements Cipher {
    @Override
    public String doEncrypt(int key, String plainText) {
        return "凯撒加密";
    }
}
