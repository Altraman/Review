package adapter.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final Cat cat = new ConcreteCat();
        final Dog dog = new ConcreteDog();
        final Adapter adapter = new Adapter(cat, dog);
        adapter.catchMouse();
        adapter.cry();
    }
}
