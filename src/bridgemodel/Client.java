package bridgemodel;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        final VideoFile videoFile = new AVIFile();
        final OperatingSystemVersion version = new MacVersion();
        version.setVf(videoFile);
        version.play("ultraMan");
    }
}
