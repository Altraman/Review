package appearance;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class EncryptFacade {
    private final FileReader FILE_READER;
    private final FileWrite FILE_WRITE;
    private final CipherMachine CIPHER_MACHINE;

    public EncryptFacade() {
        FILE_READER = new FileReader();
        FILE_WRITE = new FileWrite();
        CIPHER_MACHINE = new CipherMachine();
    }

    public final void fileEncrypt(String fileNameSrc, String fileNameDes) {
        final String plainText = FILE_READER.read(fileNameSrc);
        final String encryptStr = CIPHER_MACHINE.encrypt(plainText);
        FILE_WRITE.write(encryptStr, fileNameDes);
    }
}
