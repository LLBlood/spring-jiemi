package cn.liulin.springjiemi.designModel.mediator;

/**
 * cn.liulin.springjiemi.designModel.mediator$
 *
 * @author ll
 * @date 2024-01-22 17:24:02
 **/
public interface Mediator {
    void sendMessage(String message, Country country);
}
