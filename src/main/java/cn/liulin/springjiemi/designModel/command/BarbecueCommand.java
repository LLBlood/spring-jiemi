package cn.liulin.springjiemi.designModel.command;

/**
 * cn.liulin.springjiemi.designModel.command$
 *
 * @author ll
 * @date 2024-01-22 14:46:00
 **/
public class BarbecueCommand implements Command {

    private final Barbecuer barbecuer;

    public BarbecueCommand(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override
    public void execute() {
        this.barbecuer.barbecue();
    }
}
