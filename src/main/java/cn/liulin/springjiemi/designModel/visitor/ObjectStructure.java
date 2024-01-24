package cn.liulin.springjiemi.designModel.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * cn.liulin.springjiemi.designModel.visitor$
 *
 * @author ll
 * @date 2024-01-24 11:13:53
 **/
public class ObjectStructure {
    private List<Person> list = new LinkedList<>();

    public void attach(Person person) {
        list.add(person);
    }

    public void detach(Person person) {
        list.remove(person);
    }

    public void display(Action action) {
        for (Person person : list) {
            person.accept(action);
        }
    }
}
