package memento;

import java.util.ArrayList;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class MementoCaretaker {
    private ArrayList<ChessmanMemento> mementos = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return mementos.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementos.add(memento);
    }
}
