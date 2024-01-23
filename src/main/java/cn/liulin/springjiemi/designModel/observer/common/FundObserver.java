package cn.liulin.springjiemi.designModel.observer.common;

/**
 * cn.liulin.springjiemi.designModel.observer.common$
 *
 * @author ll
 * @date 2024-01-17 15:49:56
 **/
public class FundObserver implements Observer {

    private Subject subject;
    private String name;

    public FundObserver(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + "停止浏览基金，因为" + subject.getState());
    }
}
