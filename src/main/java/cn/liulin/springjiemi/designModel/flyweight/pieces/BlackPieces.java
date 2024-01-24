package cn.liulin.springjiemi.designModel.flyweight.pieces;

import java.awt.*;

/**
 * cn.liulin.springjiemi.designModel.flyweight.pieces$
 *
 * @author ll
 * @date 2024-01-23 17:08:53
 **/
public class BlackPieces implements ChessPieces {
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
