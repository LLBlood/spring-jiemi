package cn.liulin.springjiemi.designModel.proxy;

/**
 * cn.liulin.springjiemi.designModel.proxy$
 *
 * @author ll
 * @date 2024-01-16 17:22:41
 **/
public class Proxy implements Subject {

    private Suitor suitor;

    public Proxy(Client client) {
        this.suitor = new Suitor(client);
    }

    @Override
    public void operation() {
        suitor.operation();
    }
}
