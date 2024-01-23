package cn.liulin.springjiemi.designModel.abstractFactory.common;

import cn.liulin.springjiemi.designModel.abstractFactory.*;

/**
 * cn.liulin.springjiemi.designModel.abstractFactory$
 *
 * @author ll
 * @date 2024-01-18 10:46:33
 **/
public class OracleFactory implements IFactory {
    @Override
    public IUser createIUser() {
        return new OracleUser();
    }

    @Override
    public IDepart createIDepart() {
        return new OracleDepart();
    }
}
