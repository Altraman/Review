package command;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class EditCommand implements Command {
    private BoardScreen screen;

    public EditCommand(BoardScreen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.edit();
    }
}
