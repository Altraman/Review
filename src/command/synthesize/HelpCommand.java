package command.synthesize;

import command.Command;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class HelpCommand implements Command {
    private DisplayHelperClass displayHelperClass;

    public HelpCommand() {
        displayHelperClass = new DisplayHelperClass();
    }

    @Override
    public void execute() {
        displayHelperClass.displayHelp();
    }
}
