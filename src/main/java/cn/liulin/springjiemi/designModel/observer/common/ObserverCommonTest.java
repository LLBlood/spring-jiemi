package cn.liulin.springjiemi.designModel.observer.common;

/**
 * cn.liulin.springjiemi.designModel.observer.common$
 *
 * @author ll
 * @date 2024-01-17 15:54:15
 **/
public class ObserverCommonTest {
    public static void main(String[] args) {
        BossSubject bossSubject = new BossSubject();
        GirlSubject girlSubject = new GirlSubject();
        ShareObserver shareObserver = new ShareObserver(bossSubject, "王的五");
        FundObserver fundObserver = new FundObserver(bossSubject, "王小五");
        bossSubject.add(shareObserver);
        bossSubject.add(fundObserver);
//        bossSubject.detach(fundObserver);

        bossSubject.notifyObserver();

    }
}
