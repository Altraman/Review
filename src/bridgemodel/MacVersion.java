package bridgemodel;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class MacVersion extends OperatingSystemVersion {
    @Override
    public void play(String fileName) {
        vf.decode("mac", fileName);
    }
}
