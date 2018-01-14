package chain.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class BanZhang extends Ami {
    public BanZhang(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Mission mission) {
        if (mission.getEnemyNumber() < 10) {
            System.out.println("班长" + name + "下达代号为" + mission.getCode() + "的作战任务，敌方人数" + mission.getEnemyNumber());
        } else {
            amiContext.handleRequest(mission);
        }
    }
}
