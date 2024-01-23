package cn.liulin.springjiemi.ioc.pojo.ioc;

/**
 * cn.liulin.springjiemi.ioc.pojo.ioc$
 *
 * @author ll
 * @date 2023-12-28 10:21:55
 **/
public interface IFXNewsListener {
    String[] getAvailableNewsIds();

    FXNewsBean getNewsByPK(String newsId);

    void postProcessIfNecessary(String newsId);
}
