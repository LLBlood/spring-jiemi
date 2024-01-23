package cn.liulin.springjiemi.designModel.proxy;

/**
 * cn.liulin.springjiemi.designModel.proxy$
 *
 * @author ll
 * @date 2024-01-16 17:27:00
 **/
public class ProxyTest {
    public static void main(String[] args) {
        Client client = new Client("张三");
        Proxy proxy = new Proxy(client);
        proxy.operation();
    }
}
