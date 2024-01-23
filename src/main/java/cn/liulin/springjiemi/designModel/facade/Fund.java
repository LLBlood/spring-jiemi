package cn.liulin.springjiemi.designModel.facade;

/**
 * cn.liulin.springjiemi.designModel.facade$
 *
 * @author ll
 * @date 2024-01-17 15:01:57
 **/
public class Fund {
    private Share share;
    private NationalDebt nationalDebt;
    private RealEstate realEstate;

    public Fund() {
        share = new Share();
        nationalDebt = new NationalDebt();
        realEstate = new RealEstate();
    }

    public void method1() {
        share.buy();
        nationalDebt.buy();
        realEstate.buy();
    }

    public void method2() {
        share.sell();
        nationalDebt.sell();
        realEstate.sell();
    }
}
