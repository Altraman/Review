package command;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final BoardScreen screen = new BoardScreen();
        final Menu menu = screen.getMenu();
        final Command openCommand = new OpenCommand(screen);
        final Command createCommand = new CreateCommand(screen);
        final Command editCommand = new EditCommand(screen);

        final MenuItem openItem = menu.items.get(0);
        final MenuItem createItem = menu.items.get(1);
        final MenuItem editItem = menu.items.get(2);

        openItem.setCommand(openCommand);
        createItem.setCommand(createCommand);
        editItem.setCommand(editCommand);

        screen.display();
        openItem.click();
        createItem.click();
        editItem.click();
    }
}
