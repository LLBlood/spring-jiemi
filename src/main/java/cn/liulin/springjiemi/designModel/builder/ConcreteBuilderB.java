package cn.liulin.springjiemi.designModel.builder;

/**
 * cn.liulin.springjiemi.designModel.builder$
 *
 * @author ll
 * @date 2024-01-17 15:23:04
 **/
public class ConcreteBuilderB extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("里斯A");
    }

    @Override
    public void buildPartB() {
        product.add("里斯B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
