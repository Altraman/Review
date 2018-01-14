package appearance;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class FileReader {
    public String read(String fileNameSrc) {
        StringBuffer sb = new StringBuffer();
        try {
            final FileInputStream inputStream = new FileInputStream(fileNameSrc);
            int data;
            while ((data = inputStream.read()) != -1) {
                sb = sb.append((char) data);
            }
            inputStream.close();
        } catch (IOException e) {
            System.out.println("文件操作错误");
        }
        return sb.toString();
    }
}
