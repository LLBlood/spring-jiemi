package cn.liulin.springjiemi.designModel.memento;

/**
 * cn.liulin.springjiemi.designModel.memento$
 *
 * @author ll
 * @date 2024-01-18 17:09:20
 **/
public class GameOriginatorTest {
    public static void main(String[] args) {
        GameOriginator gameOriginator = new GameOriginator();
        gameOriginator.show();

        GameCaretaker gameCaretaker = new GameCaretaker();
        gameCaretaker.setGameMemento(gameOriginator.createGameMemento());

        gameOriginator.attackBoss();
        gameOriginator.show();

        gameOriginator.recover(gameCaretaker.gameMemento);
        gameOriginator.show();
    }
}
