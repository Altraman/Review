package bridgemodel.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Haier extends Manufacturer {
    @Override
    public void produce() {
        System.out.println("生产海尔电器");
        appliance.assemble();
    }
}
