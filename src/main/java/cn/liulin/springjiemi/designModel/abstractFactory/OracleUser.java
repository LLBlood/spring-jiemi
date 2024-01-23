package cn.liulin.springjiemi.designModel.abstractFactory;

/**
 * cn.liulin.springjiemi.designModel.abstractFactory$
 *
 * @author ll
 * @date 2024-01-18 10:44:33
 **/
public class OracleUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("OracleUser insert");
    }

    @Override
    public void update(User user) {
        System.out.println("OracleUser update");
    }
}
