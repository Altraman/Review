package state;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class Client {
    public static void main(String[] args) {
        final PlayerRole player = new PlayerRole("PKaQiu");
        final RoleState state = new PrimaryState(player);

        player.setState(state);
        player.peekCards();
        player.play(1000, "win");
        player.doubleScore(200,"win");
    }
}
