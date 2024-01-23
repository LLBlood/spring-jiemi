package cn.liulin.springjiemi.designModel.observer.entrust;

import cn.liulin.springjiemi.designModel.observer.common.FundObserver;
import cn.liulin.springjiemi.designModel.observer.common.ShareObserver;

/**
 * cn.liulin.springjiemi.designModel.observer.entrust$
 *
 * @author ll
 * @date 2024-01-17 16:25:30
 **/
public class EntrustTest {
    public static void main(String[] args) throws Exception {
        Tom tom = new Tom();
        Jerry jerry = new Jerry();
        Delegate test11 = new Delegate(tom, "test11", "123", 456);
        Delegate getResult = new Delegate(jerry, "getResult", new Integer[] {12,3,455,6}, new String[] {"12121", "2222"});
        BossEnSubject bossEnSubject = new BossEnSubject();
        bossEnSubject.events.add(test11);
        bossEnSubject.events.add(getResult);
        bossEnSubject.enNotify();
    }
}
