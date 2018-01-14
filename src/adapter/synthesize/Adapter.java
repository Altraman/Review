package adapter.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Adapter implements Cat, Dog {
    private Cat cat;
    private Dog dog;

    public Adapter(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    @Override
    public void cry() {
        dog.wang();
    }

    @Override
    public void catchMouse() {
        cat.catchMouse();
    }

    @Override
    public void wang() {
        dog.wang();
    }

    @Override
    public void action() {
        cat.catchMouse();
    }
}
