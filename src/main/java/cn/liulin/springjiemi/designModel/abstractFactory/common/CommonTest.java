package cn.liulin.springjiemi.designModel.abstractFactory.common;

import cn.liulin.springjiemi.designModel.abstractFactory.*;

/**
 * cn.liulin.springjiemi.designModel.abstractFactory.common$
 *
 * @author ll
 * @date 2024-01-18 10:47:47
 **/
public class CommonTest {
    public static void main(String[] args) {
        IFactory iFactory = new OracleFactory();
        IUser iUser = iFactory.createIUser();
        IDepart iDepart = iFactory.createIDepart();
        iUser.insert(new User());
        iUser.update(new User());
        iDepart.insert(new Depart());
        iDepart.update(new Depart());
    }
}
