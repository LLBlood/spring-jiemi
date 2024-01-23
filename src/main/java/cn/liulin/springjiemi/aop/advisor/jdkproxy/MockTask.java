package cn.liulin.springjiemi.aop.advisor.jdkproxy;

/**
 * cn.liulin.springjiemi.aop.advisor$
 *
 * @author ll
 * @date 2024-01-12 16:27:37
 **/
public class MockTask implements ITask {
    @Override
    public void execute(TaskExecutionContext ctx) {
        System.out.println("task executed.");
    }
}
