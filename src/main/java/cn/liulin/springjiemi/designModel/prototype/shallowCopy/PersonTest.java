package cn.liulin.springjiemi.designModel.prototype.shallowCopy;

import com.alibaba.fastjson.JSON;

/**
 * cn.liulin.springjiemi.designModel.prototype.shallowCopy$
 *
 * @author ll
 * @date 2024-01-17 14:09:14
 **/
public class PersonTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setName("王五");
        person.setSex("女");
        Person person1 = (Person) person.clone();
        person1.setName("王柳");
        person1.setSex("男");
        System.out.println(JSON.toJSONString(person));
        System.out.println(JSON.toJSONString(person1));
    }
}
