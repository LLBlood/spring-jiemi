package cn.liulin.springjiemi.designModel.observer.entrust;

import java.beans.EventHandler;
import java.lang.reflect.InvocationTargetException;

/**
 * cn.liulin.springjiemi.designModel.observer.entrust$
 *
 * @author ll
 * @date 2024-01-17 15:57:39
 **/
public interface EnSubject {
    void enNotify() throws InvocationTargetException, IllegalAccessException;
}
