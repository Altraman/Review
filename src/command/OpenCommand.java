package command;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class OpenCommand implements Command {
    private BoardScreen screen;

    public OpenCommand(BoardScreen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.open();
    }
}
