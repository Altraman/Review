package state;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class FinalState extends RoleState {
    public FinalState(PlayerRole role) {
        this.point = 0;
        this.grade = "骨灰级";
        this.role = role;
    }

    public FinalState(RoleState state) {
        this.point = state.point;
        this.grade = "骨灰级";
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
        if (result.equalsIgnoreCase("win")) {
            this.point += 2 * score;
            System.out.println("玩家" + role.getNickname() + "获胜，增加积分" + score + ",当前积分" + point);
        } else if (result.equalsIgnoreCase("lose")) {
            this.point -= 2 * score;
            System.out.println("玩家" + role.getNickname() + "失利，减少积分" + score + ",当前积分" + point);
        }
        check();
    }

    @Override
    public void changeCards() {
        System.out.println("换牌");
    }

    @Override
    public void peekCards() {
        System.out.println("偷看别人卡牌");
    }

    @Override
    public void check() {
        if (point < 10000 && point > 5000) {
            role.setState(new ProfessionState(this));
        } else if (point < 5000 && point >= 1000) {
            role.setState(new SecondaryState(this));
        } else if (point < 1000) {
            role.setState(new PrimaryState(this));
        }
    }
}
