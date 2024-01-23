package cn.liulin.springjiemi.designModel.abstractFactory.common;

import cn.liulin.springjiemi.designModel.abstractFactory.IDepart;
import cn.liulin.springjiemi.designModel.abstractFactory.IUser;

/**
 * cn.liulin.springjiemi.designModel.abstractFactory$
 *
 * @author ll
 * @date 2024-01-18 10:42:21
 **/
public interface IFactory {
    IUser createIUser();
    IDepart createIDepart();
}
