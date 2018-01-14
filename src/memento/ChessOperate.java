package memento;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class ChessOperate {
    private static int index = -1;
    private static final MementoCaretaker mc = new MementoCaretaker();

    private static final class Holder {
        private static final ChessOperate INSTANCE = new ChessOperate();
    }

    public static ChessOperate getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * 下棋
     *
     * @param chessMan
     */
    public final void play(ChessMan chessMan) {
        mc.setMemento(chessMan.save());
        index++;
        System.out.println("棋子" + chessMan.getLabel() + "当前位置:" + chessMan.getX() + "行" +
                chessMan.getY() + "列");
    }

    /**
     * 悔棋
     *
     * @param chessMan
     */
    public final void undo(ChessMan chessMan) {
        System.out.println("----悔棋----");
        index--;
        chessMan.restore(mc.getMemento(index));
        System.out.println("棋子" + chessMan.getLabel() + "当前位置:" + chessMan.getX() + "行" +
                chessMan.getY() + "列");
    }

    /**
     * 撤销悔棋
     *
     * @param chessMan
     */
    public final void redo(ChessMan chessMan) {
        System.out.println("----撤销悔棋----");
        index++;
        chessMan.restore(mc.getMemento(index));
        System.out.println("棋子" + chessMan.getLabel() + "当前位置:" + chessMan.getX() + "行" +
                chessMan.getY() + "列");
    }
}
