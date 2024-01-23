package cn.liulin.springjiemi.designModel.proxy;

/**
 * cn.liulin.springjiemi.designModel.proxy$
 *
 * @author ll
 * @date 2024-01-16 17:22:46
 **/
public class Suitor implements Subject {

    private Client client;

    public Suitor(Client client) {
        this.client = client;
    }

    @Override
    public void operation() {
        System.out.println(client.getName() + "送你鲜花");
    }
}
