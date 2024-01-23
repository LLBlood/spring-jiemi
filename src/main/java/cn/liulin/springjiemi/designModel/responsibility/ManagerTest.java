package cn.liulin.springjiemi.designModel.responsibility;

/**
 * cn.liulin.springjiemi.designModel.responsibility$
 *
 * @author ll
 * @date 2024-01-22 15:20:04
 **/
public class ManagerTest {
    public static void main(String[] args) {
        Request request = new Request();
        request.setRequestName("小明要请假10天");
        request.setRequestNum(10);
        request.setRequestType("加薪");

        Manager manager1 = new DirectorManager("经理");
        Manager manager2 = new GeneralManager("总经理");
        Manager manager3 = new ChairmanManager("董事长");
        manager1.setManager(manager2);
        manager2.setManager(manager3);

        manager1.handlerRequest(request);
    }
}
