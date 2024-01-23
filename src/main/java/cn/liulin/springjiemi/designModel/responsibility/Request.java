package cn.liulin.springjiemi.designModel.responsibility;

/**
 * cn.liulin.springjiemi.designModel.responsibility$
 *
 * @author ll
 * @date 2024-01-22 15:14:02
 **/
public class Request {
    private String requestName;
    private String requestType;
    private Integer requestNum;

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public Integer getRequestNum() {
        return requestNum;
    }

    public void setRequestNum(Integer requestNum) {
        this.requestNum = requestNum;
    }
}
