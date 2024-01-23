package cn.liulin.springjiemi.designModel.composite;

/**
 * cn.liulin.springjiemi.designModel.composite$
 *
 * @author ll
 * @date 2024-01-19 09:58:52
 **/
public class HRDepartmentLeaf extends Component {

    public HRDepartmentLeaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(getName());
    }

    @Override
    public void lineOfDuty() {
        System.out.println(getName() + " 员工招聘培训管理");
    }
}
