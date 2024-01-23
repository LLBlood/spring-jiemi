package cn.liulin.springjiemi.designModel.observer.entrust;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

/**
 * cn.liulin.springjiemi.designModel.observer.entrust$
 *
 * @author ll
 * @date 2024-01-17 16:24:12
 **/
public class BossEnSubject implements EnSubject {

    public List<Delegate> events = new LinkedList<>();

    @Override
    public void enNotify() throws InvocationTargetException, IllegalAccessException {
        for (Delegate event : events) {
            event.invoke();
        }
    }
}
