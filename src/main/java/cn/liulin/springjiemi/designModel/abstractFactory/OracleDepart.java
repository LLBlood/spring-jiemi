package cn.liulin.springjiemi.designModel.abstractFactory;

/**
 * cn.liulin.springjiemi.designModel.abstractFactory$
 *
 * @author ll
 * @date 2024-01-18 10:44:33
 **/
public class OracleDepart implements IDepart {

    @Override
    public void insert(Depart depart) {
        System.out.println("OracleDepart insert");
    }

    @Override
    public void update(Depart depart) {
        System.out.println("OracleDepart update");
    }
}
