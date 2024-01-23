package cn.liulin.springjiemi.designModel.mediator;

/**
 * cn.liulin.springjiemi.designModel.mediator$
 *
 * @author ll
 * @date 2024-01-22 17:24:43
 **/
public class ConcreteCountry2 extends Country {

    public ConcreteCountry2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        this.mediator.sendMessage(message, this);
    }

    public void notify(String message) {
        System.out.println("同事2得到消息" + message);
    }
}
