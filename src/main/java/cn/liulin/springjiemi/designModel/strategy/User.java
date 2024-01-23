package cn.liulin.springjiemi.designModel.strategy;

/**
 * cn.liulin.springjiemi.designModel.strategy$
 *
 * @author ll
 * @date 2024-01-16 14:59:42
 **/
public class User {
    public static void main(String[] args) {
        Context context = new Context(new BicycleStrategy());
        context.goContext();

        SimpleFactoryContext context1 = new SimpleFactoryContext(4);
        context1.goContext();
    }
}
