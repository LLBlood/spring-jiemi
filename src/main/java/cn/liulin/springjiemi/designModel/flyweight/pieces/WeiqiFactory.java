package cn.liulin.springjiemi.designModel.flyweight.pieces;

import java.util.ArrayList;

/**
 * cn.liulin.springjiemi.designModel.flyweight.pieces$
 *
 * @author ll
 * @date 2024-01-23 17:09:08
 **/
public class WeiqiFactory {
    private ArrayList<ChessPieces> qz;
    public WeiqiFactory() {
        qz = new ArrayList<ChessPieces>();
        ChessPieces w = new WhitePieces();
        qz.add(w);
        ChessPieces b = new BlackPieces();
        qz.add(b);
    }
    public ChessPieces getChessPieces(String type) {
        if (type.equalsIgnoreCase("w")) {
            return (ChessPieces) qz.get(0);
        } else if (type.equalsIgnoreCase("b")) {
            return (ChessPieces) qz.get(1);
        } else {
            return null;
        }
    }
}
