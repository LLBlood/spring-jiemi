package cn.liulin.springjiemi.designModel.composite;

/**
 * cn.liulin.springjiemi.designModel.composite$
 *
 * @author ll
 * @date 2024-01-19 10:01:37
 **/
public class ComponentTest {
    public static void main(String[] args) {
        ConcreteCompanyComposite root = new ConcreteCompanyComposite("北京总公司");
        root.add(new HRDepartmentLeaf("总公司人力资源部"));
        root.add(new FinanceDepartmentLeaf("总公司财务部"));
        ConcreteCompanyComposite comp= new ConcreteCompanyComposite("上海华华东分公司");
        comp.add(new HRDepartmentLeaf("华东分公司人力资源部") ) ;
        comp.add(new FinanceDepartmentLeaf("华东分公司财务部"));
        root.add(comp);
        ConcreteCompanyComposite compl = new ConcreteCompanyComposite("南京办事处");
        compl.add(new HRDepartmentLeaf("南京办事处人力资源部"));
        compl.add(new FinanceDepartmentLeaf("南京办事处财务部"));
        comp.add(compl);
        ConcreteCompanyComposite comp2= new ConcreteCompanyComposite("杭州办事处");
        comp2.add(new HRDepartmentLeaf("杭州办事处人力资源部"));
        comp2.add(new FinanceDepartmentLeaf("杭州办事处财务部"));
        comp.add(comp2);
        System.out.println("\n结构图：");
        root.display(1);
        System.out.println("\n职责：");
        root.lineOfDuty();
    }
}
