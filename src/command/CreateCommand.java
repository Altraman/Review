package command;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class CreateCommand implements Command {
    private BoardScreen screen;

    public CreateCommand(BoardScreen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.create();
    }
}
