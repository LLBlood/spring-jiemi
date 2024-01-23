package cn.liulin.springjiemi.ioc.event;

/**
 * cn.liulin.springjiemi.ioc.event$
 *
 * @author ll
 * @date 2024-01-04 16:43:56
 **/
public enum MethodExecutionStatus {
    /**
     * begin
     */
    BEGIN("begin"),

    /**
     * end
     */
    END("end"),
    ;
    private String msg;

    MethodExecutionStatus(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
