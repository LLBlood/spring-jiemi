package cn.liulin.springjiemi.designModel.abstractFactory.simple;

import cn.liulin.springjiemi.designModel.abstractFactory.*;

/**
 * cn.liulin.springjiemi.designModel.abstractFactory.simple$
 *
 * @author ll
 * @date 2024-01-18 10:48:59
 **/
public class SimpleFactory {
    private static String db = "oracle";
    public static IUser getIUser() {
        IUser iUser = null;
        switch (db) {
            case "mysql":
                iUser = new MySQLUser();
                break;
            case "oracle":
                iUser = new OracleUser();
                break;
            default:
                break;
        }
        return iUser;
    }

    public static IDepart getIDepart() {
        IDepart iDepart = null;
        switch (db) {
            case "mysql":
                iDepart = new MySQLDepart();
                break;
            case "oracle":
                iDepart = new OracleDepart();
                break;
            default:
                break;
        }
        return iDepart;
    }
}
