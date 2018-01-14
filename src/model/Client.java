package model;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class Client {
    public static void main(String[] args) {
        final Account account = new CurrentAccount();
        account.handle();
    }
}
