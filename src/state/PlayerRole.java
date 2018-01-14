package state;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class PlayerRole extends RoleState {
    private String nickname;
    private RoleState state;

    public PlayerRole(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setState(RoleState state) {
        this.state = state;
    }

    @Override
    public void play(int score, String result) {
        state.play(score, result);
    }

    @Override
    public void doubleScore(int score, String result) {
        state.doubleScore(score, result);
    }

    @Override
    public void changeCards() {
        state.changeCards();
    }

    @Override
    public void peekCards() {
        state.peekCards();
    }

    @Override
    public void check() {

    }
}
