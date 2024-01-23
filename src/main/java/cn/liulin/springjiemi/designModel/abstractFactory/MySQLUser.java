package cn.liulin.springjiemi.designModel.abstractFactory;

/**
 * cn.liulin.springjiemi.designModel.abstractFactory$
 *
 * @author ll
 * @date 2024-01-18 10:43:57
 **/
public class MySQLUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("mysqlUser insert");
    }

    @Override
    public void update(User user) {
        System.out.println("mysqlUser update");
    }
}
