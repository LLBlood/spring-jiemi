package cn.liulin.springjiemi.ioc.pojo.iocext;

/**
 * cn.liulin.springjiemi.ioc.pojo.ioc$
 *
 * @author ll
 * @date 2023-12-28 10:33:01
 **/
public class DowJonesNewsListenerExt implements IFXNewsListenerExt {
    @Override
    public String[] getAvailableNewsIds() {
        return new String[0];
    }

    @Override
    public FXNewsBeanExt getNewsByPK(String newsId) {
        return null;
    }

    @Override
    public void postProcessIfNecessary(String newsId) {

    }
}
