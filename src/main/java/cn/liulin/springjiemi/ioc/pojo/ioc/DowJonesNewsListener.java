package cn.liulin.springjiemi.ioc.pojo.ioc;

import org.springframework.stereotype.Component;

/**
 * cn.liulin.springjiemi.ioc.pojo.ioc$
 *
 * @author ll
 * @date 2023-12-28 10:33:01
 **/
@Component
public class DowJonesNewsListener implements IFXNewsListener {
    @Override
    public String[] getAvailableNewsIds() {
        return new String[0];
    }

    @Override
    public FXNewsBean getNewsByPK(String newsId) {
        return null;
    }

    @Override
    public void postProcessIfNecessary(String newsId) {

    }
}
