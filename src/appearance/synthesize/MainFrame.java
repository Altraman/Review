package appearance.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class MainFrame {
    private final Memory MEMORY;
    private final Cpu CPU;
    private final HardDisk HARD_DISK;
    private final Os OS;

    public MainFrame() {
        MEMORY = new Memory();
        CPU = new Cpu();
        HARD_DISK = new HardDisk();
        OS = new Os();
    }

    public void on() {
        try {
            MEMORY.check();
            CPU.run();
            HARD_DISK.read();
            OS.load();
        } catch (Exception e) {
            System.out.println("启动失败");
        }
    }
}
