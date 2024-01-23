package cn.liulin.springjiemi.designModel.state;

/**
 * cn.liulin.springjiemi.designModel.state$
 *
 * @author ll
 * @date 2024-01-18 14:01:32
 **/
public class Context {
    private Integer hour;
    private Boolean finish;
    private State state;

    public Context() {
        this.state = new MorningState();
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Boolean getFinish() {
        return finish != null && finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void work() {
        state.handle(this);
    }
}
