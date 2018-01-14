package appearance;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class CipherMachine {
    public String encrypt(String plainText) {
        final StringBuilder es = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            final String c = String.valueOf(plainText.charAt(i) % 7);
            es.append(c);
        }
        return es.toString();
    }
}
