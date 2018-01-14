package command.synthesize;

import command.Command;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class FunctionButton {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
