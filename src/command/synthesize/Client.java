package command.synthesize;

import command.Command;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final Command helpCommand = new HelpCommand();
        final Command exitCommand = new ExitCommand();

        final FunctionButton button = new FunctionButton();
        button.setCommand(helpCommand);
        button.click();
        button.setCommand(exitCommand);
        button.click();
    }
}
