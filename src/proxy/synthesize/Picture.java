package proxy.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Picture implements Subject {
    private Application application;

    public Picture() {
        application = new Application();
    }

    @Override
    public void run() {
        application.run();
    }
}
