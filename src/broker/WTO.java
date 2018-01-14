package broker;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class WTO extends UnitedNations {
    private China china;
    private America america;

    public void setChina(China china) {
        this.china = china;
    }

    public void setAmerica(America america) {
        this.america = america;
    }

    @Override
    public void declare(String message, Country country) {
        if (country == china) {
            america.getMessage(message);
        } else {
            china.getMessage(message);
        }
    }
}
