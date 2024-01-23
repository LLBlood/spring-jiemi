package cn.liulin.springjiemi.designModel.command;

/**
 * cn.liulin.springjiemi.designModel.command$
 *
 * @author ll
 * @date 2024-01-22 14:51:24
 **/
public class CommandTest {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer("王五");
        Command commandA = new ChickenCommand(barbecuer);
        Command commandB = new BarbecueCommand(barbecuer);
        Command commandC = new ChickenCommand(barbecuer);
        Invoker invoker = new Invoker();
        invoker.setOrder(commandA);
        invoker.setOrder(commandB);
        invoker.setOrder(commandC);
        invoker.execute();
    }
}
