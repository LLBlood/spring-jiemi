package cn.liulin.springjiemi.designModel.memento;

/**
 * cn.liulin.springjiemi.designModel.memento$
 *
 * @author ll
 * @date 2024-01-18 17:08:57
 **/
public class GameCaretaker {
    public GameMemento gameMemento;

    public GameMemento getGameMemento() {
        return gameMemento;
    }

    public void setGameMemento(GameMemento gameMemento) {
        this.gameMemento = gameMemento;
    }
}
