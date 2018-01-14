package chain.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public class Mission {
    private String code;
    private int enemyNumber;

    public Mission(String code, int enemyNumber) {
        this.code = code;
        this.enemyNumber = enemyNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getEnemyNumber() {
        return enemyNumber;
    }

    public void setEnemyNumber(int enemyNumber) {
        this.enemyNumber = enemyNumber;
    }
}
