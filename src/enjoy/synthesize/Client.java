package enjoy.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final SharedString sharedString1;
        final SharedString sharedString2;

        final SharedStringFactory factory = SharedStringFactory.getInstance();
        sharedString1 = factory.getSharedString("Java");
        sharedString1.setColor(new Color("红色"));
        sharedString1.setSize(new Size(15));
        sharedString1.display();

        sharedString2 = factory.getSharedString("Java");
        sharedString2.setColor(new Color("黑色"));
        sharedString2.setSize(new Size(17));
        sharedString2.display();

        System.out.println(sharedString1 == sharedString2);
    }
}
