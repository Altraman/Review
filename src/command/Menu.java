package command;

import java.util.ArrayList;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Menu {
    public final ArrayList<MenuItem> items = new ArrayList<>();

    public final void addMenu(MenuItem menuItem) {
        items.add(menuItem);
    }
}
