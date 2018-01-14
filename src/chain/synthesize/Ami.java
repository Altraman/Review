package chain.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public abstract class Ami {
    protected Ami amiContext;
    protected String name;

    public void setAmiContext(Ami ami) {
        this.amiContext = ami;
    }

    public Ami(String name) {
        this.name = name;
    }

    public abstract void handleRequest(Mission mission);
}
