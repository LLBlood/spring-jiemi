package cn.liulin.springjiemi.designModel.abstractFactory.reflect;

import cn.liulin.springjiemi.designModel.abstractFactory.Depart;
import cn.liulin.springjiemi.designModel.abstractFactory.IDepart;
import cn.liulin.springjiemi.designModel.abstractFactory.IUser;
import cn.liulin.springjiemi.designModel.abstractFactory.User;
import cn.liulin.springjiemi.designModel.abstractFactory.simple.SimpleFactory;

/**
 * cn.liulin.springjiemi.designModel.abstractFactory.reflect$
 *
 * @author ll
 * @date 2024-01-18 10:57:53
 **/
public class ReflectFactoryTest {
    public static void main(String[] args) {
        IUser iUser = ReflectFactory.getIUser();
        IDepart iDepart = ReflectFactory.getIDepart();
        iUser.insert(new User());
        iUser.update(new User());
        iDepart.insert(new Depart());
        iDepart.update(new Depart());
    }
}
