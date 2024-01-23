package cn.liulin.springjiemi.designModel.command;

/**
 * cn.liulin.springjiemi.designModel.command$
 *
 * @author ll
 * @date 2024-01-22 14:47:09
 **/
public class ChickenCommand implements Command {

    private final Barbecuer barbecuer;

    public ChickenCommand(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override
    public void execute() {
        this.barbecuer.chicken();
    }
}
