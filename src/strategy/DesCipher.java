package strategy;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class DesCipher implements Cipher {
    @Override
    public String doEncrypt(int key, String plainText) {
        return "DES加密";
    }
}
