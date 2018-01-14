package state;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class PrimaryState extends RoleState {
    public PrimaryState(PlayerRole role) {
        this.point = 0;
        this.grade = "入门级";
        this.role = role;
    }

    public PrimaryState(RoleState state) {
        this.point = state.point;
        this.grade = "入门级";
        this.role = state.role;
    }

    @Override
    public void play(int score, String result) {
        if (result.equalsIgnoreCase("win")) {
            this.point += score;
            System.out.println("玩家" + role.getNickname() + "获胜，增加积分" + score + ",当前积分" + point);
        } else if (result.equalsIgnoreCase("lose")) {
            this.point -= score;
            System.out.println("玩家" + role.getNickname() + "失利，减少积分" + score + ",当前积分" + point);
        }
        check();
    }

    @Override
    public void doubleScore(int score, String result) {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void changeCards() {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void peekCards() {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void check() {
        if (point >= 10000) {
            role.setState(new FinalState(this));
        } else if (point >= 5000) {
            role.setState(new ProfessionState(this));
        } else if (point >= 1000) {
            role.setState(new SecondaryState(this));
        }
    }
}
