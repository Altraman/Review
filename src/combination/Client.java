package combination;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final AbstractFile image1 = new ImageFile("apple.jpg");
        final AbstractFile image2 = new ImageFile("apple1.jpg");
        final AbstractFile image3 = new ImageFile("apple2.jpg");
        final AbstractFile folder = new Folder("fruit");
        folder.add(image1);
        folder.add(image2);
        folder.add(image3);
        folder.display();
    }
}
