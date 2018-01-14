package chain.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class YingZhang extends Ami {
    public YingZhang(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Mission mission) {
        if (mission.getEnemyNumber() >= 50 && mission.getEnemyNumber() < 200) {
            System.out.println("营长" + name + "下达代号为" + mission.getCode() + "的作战任务，敌方人数" + mission.getEnemyNumber());
        } else {
            System.out.println("开会讨论代号为" + mission.getCode() + "的作战任务，敌方人数" + mission.getEnemyNumber());
        }
    }
}
