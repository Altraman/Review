package combination;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile element) {

    }

    @Override
    public void remove(AbstractFile element) {

    }

    @Override
    public void display() {
        System.out.println("浏览图片文件:" + name);
    }
}
