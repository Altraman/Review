package bridgemodel;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class AVIFile implements VideoFile {
    @Override
    public void decode(String osType, String fileName) {
        System.out.println("AVI格式文件" + fileName + "在" + osType + "平台");
    }
}
