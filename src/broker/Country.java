package broker;

/**
 * Created by HuQiang on 2018/1/8.
 */
public abstract class Country {
    protected UnitedNations un;

    public void setUn(UnitedNations un) {
        this.un = un;
    }

    public void declare(String message) {
        un.declare(message, this);
    }

    public abstract void getMessage(String message);
}
