package cn.liulin.springjiemi.designModel.abstractFactory;

/**
 * cn.liulin.springjiemi.designModel.abstractFactory$
 *
 * @author ll
 * @date 2024-01-18 10:43:57
 **/
public class MySQLDepart implements IDepart {

    @Override
    public void insert(Depart depart) {
        System.out.println("MySQLDepart insert");
    }

    @Override
    public void update(Depart depart) {
        System.out.println("MySQLDepart insert");
    }
}
