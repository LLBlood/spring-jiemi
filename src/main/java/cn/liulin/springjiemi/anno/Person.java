package cn.liulin.springjiemi.anno;

/**
 * cn.liulin.springjiemi.anno$
 *
 * @author ll
 * @date 2024-01-16 13:38:52
 **/
@MyAnnotation(msg = "this person class")
public class Person {
    private String name;
    private String sex;
    @MyAnnotation(msg = "this person field public")
    public int height;
    @MyAnnotation(msg = "this person field private")
    private int weight;

    public void sleep() {
        System.out.println(this.name+"--"+ "睡觉");
    }

    public void eat() {
        System.out.println(this.name+"--"+ "吃饭");
    }

    @MyAnnotation(msg = "this person method")
    public void dance() {
        System.out.println(this.name+"--"+ "跳舞");
    }
}
