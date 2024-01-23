package cn.liulin.springjiemi.designModel.mediator;

/**
 * cn.liulin.springjiemi.designModel.mediator$
 *
 * @author ll
 * @date 2024-01-22 17:25:38
 **/
public class ConcreteMediator implements Mediator {

    private ConcreteCountry1 concreteCountry1;
    private ConcreteCountry2 concreteCountry2;

    public void setConcreteCountry1(ConcreteCountry1 concreteCountry1) {
        this.concreteCountry1 = concreteCountry1;
    }

    public void setConcreteCountry2(ConcreteCountry2 concreteCountry2) {
        this.concreteCountry2 = concreteCountry2;
    }

    @Override
    public void sendMessage(String message, Country country) {
        if (country == concreteCountry1) {
            concreteCountry2.notify(message);
        }

        if (country == concreteCountry2) {
            concreteCountry1.notify(message);
        }
    }
}
