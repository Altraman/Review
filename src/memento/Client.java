package memento;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class Client {
    public static void main(String[] args) {
        final ChessMan man = new ChessMan("车", 1, 1);
        final ChessOperate operate = ChessOperate.getInstance();
        operate.play(man);
        man.setY(4);
        operate.play(man);
        man.setX(5);
        operate.play(man);
        operate.undo(man);
        operate.undo(man);
        operate.redo(man);
        operate.redo(man);
    }
}
