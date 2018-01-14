package command.synthesize;

import command.Command;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class ExitCommand implements Command {
    private SystemExitClass systemExitClass;

    public ExitCommand() {
        systemExitClass = new SystemExitClass();
    }

    @Override
    public void execute() {
        systemExitClass.exit();
    }
}
