package cn.liulin.springjiemi.designModel.abstractFactory.simple;

import cn.liulin.springjiemi.designModel.abstractFactory.Depart;
import cn.liulin.springjiemi.designModel.abstractFactory.IDepart;
import cn.liulin.springjiemi.designModel.abstractFactory.IUser;
import cn.liulin.springjiemi.designModel.abstractFactory.User;

/**
 * cn.liulin.springjiemi.designModel.abstractFactory.simple$
 *
 * @author ll
 * @date 2024-01-18 10:52:07
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        IUser iUser = SimpleFactory.getIUser();
        IDepart iDepart = SimpleFactory.getIDepart();
        iUser.insert(new User());
        iUser.update(new User());
        iDepart.insert(new Depart());
        iDepart.update(new Depart());
    }
}
