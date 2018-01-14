package model;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class CurrentAccount extends Account {
    @Override
    public void getUserType() {
        System.out.println("活期账户");
    }

    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息");
    }
}
