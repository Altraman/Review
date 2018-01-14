package combination.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Office extends Unit {
    private String name;

    public Office(String name) {
        this.name = name;
    }

    @Override
    public void handleArchives() {
        System.out.println(name + "处理公文");
    }
}
