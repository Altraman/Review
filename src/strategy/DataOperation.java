package strategy;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class DataOperation {
    private Cipher cipher;

    public void setCipher(Cipher cipher) {
        this.cipher = cipher;
    }

    public String doEncrypt(int key, String plainText) {
        return cipher.doEncrypt(key, plainText);
    }
}
