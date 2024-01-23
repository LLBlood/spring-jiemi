package cn.liulin.springjiemi.designModel.observer.common;

/**
 * cn.liulin.springjiemi.designModel.observer.common$
 *
 * @author ll
 * @date 2024-01-17 15:48:19
 **/
public interface Subject {
    void add(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
    String getState();
}
