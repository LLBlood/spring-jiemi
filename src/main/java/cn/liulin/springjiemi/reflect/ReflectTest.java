package cn.liulin.springjiemi.reflect;

import org.junit.Test;

/**
 * cn.liulin.springjiemi.reflect$
 *
 * @author ll
 * @date 2024-01-15 17:16:13
 **/
public class ReflectTest {
    @Test
    public void test1() {
        Class<String> cls = String.class;
        System.out.println(cls);
    }

    @Test
    public void test2() throws ClassNotFoundException {
        Class<?> clas = Class.forName("java.lang.String");
        System.out.println(clas);
    }

    @Test
    public void test3() throws ClassNotFoundException {
        String s = new String();
        System.out.println(s.getClass());
    }

    @Test
    public void test4() throws ClassNotFoundException {
        Class<?> aClass = this.getClass().getClassLoader().loadClass("java.lang.String");
        System.out.println(aClass);
    }

    @Test
    public void test5() {
        //String类
        printClassInfo("".getClass());
        System.out.println("====================================");
        //Runnable接口
        printClassInfo(Runnable.class);
        System.out.println("====================================");
        //枚举
        printClassInfo(java.time.Month.class);
        System.out.println("====================================");
        //数组类型
        printClassInfo(String[].class);
        System.out.println("====================================");
        //基本类型
        printClassInfo(int.class);
    }

    static void printClassInfo(Class<?> cls) {
        System.out.println("Class name : " + cls.getClass());
        // 返回源代码中给出的底层类的简称
        System.out.println("Simple name : " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        // 判定指定的 Class 对象是否表示一个接口类型
        System.out.println("is interface: " + cls.isInterface());
        //当且仅当该类声明为源代码中的枚举时返回
        System.out.println("is enum: " + cls.isEnum());
        //判定此 Class 对象是否表示一个数组类
        System.out.println("is array: " + cls.isArray());
        //判定指定的 Class 对象是否表示一个基本类型
        System.out.println("is primitive: " + cls.isPrimitive());
    }

    @Test
    public void test6() throws IllegalAccessException, InstantiationException {
        Class<String> stringClass = String.class;
        String s = stringClass.newInstance();
        System.out.println(s);
    }
}
