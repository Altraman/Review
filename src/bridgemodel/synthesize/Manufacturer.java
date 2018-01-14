package bridgemodel.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public abstract class Manufacturer {
    protected Appliance appliance;

    public void setAppliance(Appliance appliance) {
        this.appliance = appliance;
    }

    public abstract void produce();
}
