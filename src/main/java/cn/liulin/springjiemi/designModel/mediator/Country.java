package cn.liulin.springjiemi.designModel.mediator;

/**
 * cn.liulin.springjiemi.designModel.mediator$
 *
 * @author ll
 * @date 2024-01-22 17:24:43
 **/
public abstract class Country {
    protected Mediator mediator;

    public Country(Mediator mediator) {
        this.mediator = mediator;
    }
}
