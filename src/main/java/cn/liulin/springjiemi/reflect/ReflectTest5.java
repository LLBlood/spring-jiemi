package cn.liulin.springjiemi.reflect;

import java.lang.reflect.Constructor;

/**
 * cn.liulin.springjiemi.reflect$
 *
 * @author ll
 * @date 2024-01-16 11:34:23
 **/
public class ReflectTest5 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("cn.liulin.springjiemi.reflect.Student22");
        System.out.println("**************所有公有构造函数***************");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("**************所有的构造方法(包括：私有，受保护，默认，公有)**************");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("**************获取公有、无参的构造方法***************");
        Constructor con = aClass.getConstructor(null);
        //这里注意null指的是类型参数是空，是参数的类型，不写也可以
        System.out.println("con = " + con);
        //调用构造函数
        Object obj = con.newInstance();//打印公有，无参构造函数
        System.out.println("****************获取私有构造函数，并调用*****************");
        con = aClass.getDeclaredConstructor(char.class);
        System.out.println(con);
        //调用构造函数
        con.setAccessible(true);//暴力访问（忽略访问修饰符）
        obj = con.newInstance('女');
    }
}
class Student22{
    //构造方法
    //默认的构造方法
    Student22(String str) {
        System.out.println("默认的构造方法s = " + str);
    }
    //无参构造函数
    public Student22(){
        System.out.println("公有，无参构造函数");
    }
    //一个参数的构造函数
    public Student22(char name){
        System.out.println("姓名：" + name);
    }
    //多个参数的构造函数
    public Student22(String name, int age){
        System.out.println("姓名:" + name + "年龄:" + age);
    }
    //受保护的构造函数
    protected Student22(boolean n){
        System.out.println("受保护的构造函数 n = " + n);
    }
    //私有构造函数
    private Student22(int age) {
        System.out.println("私有的构造函数 年龄：" + age);
    }
}