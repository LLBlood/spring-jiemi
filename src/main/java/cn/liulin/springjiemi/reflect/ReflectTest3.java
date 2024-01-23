package cn.liulin.springjiemi.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * cn.liulin.springjiemi.reflect$
 *
 * @author ll
 * @date 2024-01-15 17:46:54
 **/
public class ReflectTest3 {
    public static void main(String[] args) throws NoSuchFieldException {
        Field value = String.class.getDeclaredField("value");
        System.out.println(value.getName());
        System.out.println(value.getType());
        int modifiers = value.getModifiers();
        System.out.println(Modifier.isFinal(modifiers));
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isProtected(modifiers));
        System.out.println(Modifier.isPrivate(modifiers));
        System.out.println(Modifier.isStatic(modifiers));
    }
}
