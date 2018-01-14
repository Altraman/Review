package bridgemodel.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final Appliance tel = new Television();
        final Manufacturer manufacturer = new Haier();
        manufacturer.setAppliance(tel);
        manufacturer.produce();
    }
}
