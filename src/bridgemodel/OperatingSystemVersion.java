package bridgemodel;

/**
 * Created by HuQiang on 2018/1/8.
 */
public abstract class OperatingSystemVersion {
    protected VideoFile vf;

    public void setVf(VideoFile vf) {
        this.vf = vf;
    }

    public abstract void play(String fileName);
}
