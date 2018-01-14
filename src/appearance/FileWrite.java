package appearance;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class FileWrite {
    public void write(String encryptStr, String fileNameDes) {
        try {
            final FileOutputStream outputStream = new FileOutputStream(fileNameDes);
            outputStream.write(encryptStr.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("文件写入错误");
        }
    }
}
