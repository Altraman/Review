package command;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class BoardScreen {
    private final Menu MENU;
    private final MenuItem OPEN_ITEM;
    private final MenuItem CREATE_ITEM;
    private final MenuItem EDIT_ITEM;

    public BoardScreen() {
        MENU = new Menu();
        OPEN_ITEM = new MenuItem("打开");
        CREATE_ITEM = new MenuItem("新建");
        EDIT_ITEM = new MenuItem("编辑");
        MENU.addMenu(OPEN_ITEM);
        MENU.addMenu(CREATE_ITEM);
        MENU.addMenu(EDIT_ITEM);
    }

    public void display() {
        System.out.println("主菜单选项:");
        for (MenuItem menuItem : MENU.items) {
            System.out.println(menuItem.getName());
        }
    }

    public void open() {
        System.out.println("显示打开窗口");
    }

    public void create() {
        System.out.println("显示新建窗口");
    }

    public void edit() {
        System.out.println("显示编辑窗口");
    }

    public Menu getMenu() {
        return MENU;
    }
}
