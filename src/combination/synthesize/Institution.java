package combination.synthesize;

import java.util.ArrayList;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Institution extends Unit {
    private final ArrayList<Unit> list = new ArrayList<>();
    private String name;

    public Institution(String name) {
        this.name = name;
    }

    public final void add(Unit unit) {
        list.add(unit);
    }

    @Override
    public void handleArchives() {
        System.out.println(name + "接受并下发公文");
        for (Unit unit : list) {
            unit.handleArchives();
        }
    }
}
