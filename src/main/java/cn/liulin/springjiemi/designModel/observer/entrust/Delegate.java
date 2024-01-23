package cn.liulin.springjiemi.designModel.observer.entrust;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * cn.liulin.springjiemi.designModel.observer.entrust$
 *
 * @author ll
 * @date 2024-01-17 16:15:40
 **/
public class Delegate {
    private Object object;
    private Method method;
    private Object[] parameters;

    public Delegate(Object obj, String method, Object... args) throws NoSuchMethodException {
        Class<?> aClass = obj.getClass();
        this.object = obj;
        this.parameters = args;
        Class<?>[] parameterTypes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            parameterTypes[i] = arg.getClass();
        }
        this.method = aClass.getDeclaredMethod(method, parameterTypes);
    }

    public Object invoke() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(object, parameters);
    }
}
