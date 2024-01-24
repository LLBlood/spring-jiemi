package cn.liulin.springjiemi.designModel.flyweight.pieces;

import java.awt.*;

/**
 * cn.liulin.springjiemi.designModel.flyweight.pieces$
 *
 * @author ll
 * @date 2024-01-23 17:08:32
 **/
public class WhitePieces implements ChessPieces {
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
