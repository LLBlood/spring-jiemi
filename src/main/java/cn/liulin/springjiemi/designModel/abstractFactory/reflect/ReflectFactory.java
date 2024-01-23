package cn.liulin.springjiemi.designModel.abstractFactory.reflect;

import cn.liulin.springjiemi.designModel.abstractFactory.IDepart;
import cn.liulin.springjiemi.designModel.abstractFactory.IUser;

/**
 * cn.liulin.springjiemi.designModel.abstractFactory.reflect$
 *
 * @author ll
 * @date 2024-01-18 10:58:00
 **/
public class ReflectFactory {
    private static String packageName = "cn.liulin.springjiemi.designModel.abstractFactory";
    private static String dbName = "MySQL";
    public static IUser getIUser() {
        IUser iUser = null;
        try {
            String className = packageName + "." + dbName + "User";
            iUser = (IUser) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iUser;
    }

    public static IDepart getIDepart() {
        IDepart iDepart = null;
        try {
            String className = packageName + "." + dbName + "Depart";
            iDepart = (IDepart) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iDepart;
    }
}
