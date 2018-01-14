package combination;

import java.util.ArrayList;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Folder extends AbstractFile {
    private ArrayList<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile element) {
        fileList.add(element);
    }

    @Override
    public void remove(AbstractFile element) {
        fileList.remove(element);
    }

    @Override
    public void display() {
        for (AbstractFile file : fileList) {
            file.display();
        }
    }
}
