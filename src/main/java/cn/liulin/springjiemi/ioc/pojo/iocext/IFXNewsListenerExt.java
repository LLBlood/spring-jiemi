package cn.liulin.springjiemi.ioc.pojo.iocext;

/**
 * cn.liulin.springjiemi.ioc.pojo.ioc$
 *
 * @author ll
 * @date 2023-12-28 10:21:55
 **/
public interface IFXNewsListenerExt {
    String[] getAvailableNewsIds();

    FXNewsBeanExt getNewsByPK(String newsId);

    void postProcessIfNecessary(String newsId);
}
