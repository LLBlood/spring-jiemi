package cn.liulin.springjiemi.designModel.command;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * cn.liulin.springjiemi.designModel.command$
 *
 * @author ll
 * @date 2024-01-22 14:43:46
 **/
public class Invoker {
    private List<Command> list = new LinkedList<>();

    private Random random = new Random();

    public void setOrder(Command command) {
        if (command instanceof ChickenCommand) {
            if (random.nextInt(2) == 1) {
                System.out.println("您运气不好，鸡翅没得吃了");
            } else {
                list.add(command);
            }
        } else {
            list.add(command);
        }
    }

    public void removeOrder(Command command) {
        list.remove(command);
        System.out.println("执行撤销成功");
    }

    public void execute() {
        for (Command command : list) {
            command.execute();
        }
    }
}
