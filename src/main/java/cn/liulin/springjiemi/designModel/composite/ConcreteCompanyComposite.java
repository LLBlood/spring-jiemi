package cn.liulin.springjiemi.designModel.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * cn.liulin.springjiemi.designModel.composite$
 *
 * @author ll
 * @date 2024-01-19 09:45:26
 **/
public class ConcreteCompanyComposite extends Component {

    public ConcreteCompanyComposite(String name) {
        super(name);
    }

    public List<Component> children = new LinkedList<>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(getName());
        for (Component child : children) {
            child.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Component child : children) {
            child.lineOfDuty();
        }
    }
}
