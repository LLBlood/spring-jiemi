package cn.liulin.springjiemi.designModel.observer.common;

import java.util.LinkedList;
import java.util.List;

/**
 * cn.liulin.springjiemi.designModel.observer.common$
 *
 * @author ll
 * @date 2024-01-17 15:53:03
 **/
public class GirlSubject implements Subject {

    private List<Observer> observerList = new LinkedList<>();

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    @Override
    public String getState() {
        return "前台发通知了";
    }
}
