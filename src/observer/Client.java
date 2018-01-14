package observer;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class Client {
    public static void main(String[] args) {
        final Player player1 = new Player("胡强");
        final Player player2 = new Player("方抒怀");
        final Player player3 = new Player("张定康");

        final Ally ally = new Ally();
        ally.join(player1);
        ally.join(player2);
        ally.join(player3);

        player1.beAttacked(ally);
    }
}
