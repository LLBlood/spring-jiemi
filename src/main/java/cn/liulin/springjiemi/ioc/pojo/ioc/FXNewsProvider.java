package cn.liulin.springjiemi.ioc.pojo.ioc;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * cn.liulin.springjiemi.ioc.pojo.ioc$
 * FX全称为“Foreign Exchange”,外汇交易
 *
 * @author ll
 * @date 2023-12-28 10:20:20
 **/
@Component
public class FXNewsProvider {
    @Autowired
    private IFXNewsListener newsListener;

    @Autowired
    private IFXNewsPersister newPersistener;

    public FXNewsProvider() {
        this.newsListener = new DowJonesNewsListener();
        this.newPersistener = new DowJonesNewsPersister();
    }

    /**
     * ioc 构造方法注入
     * @param newsListner
     * @param newsPersister
     */
    public FXNewsProvider(IFXNewsListener newsListner, IFXNewsPersister newsPersister) {
        this.newsListener = newsListner;
        this.newPersistener = newsPersister;
    }

    public IFXNewsListener getNewsListener() {
        return newsListener;
    }

    /**
     * ioc setter方法注入
     * @param newsListener
     */
    public void setNewsListener(IFXNewsListener newsListener) {
        this.newsListener = newsListener;
    }

    public IFXNewsPersister getNewPersistener() {
        return newPersistener;
    }

    public void setNewPersistener(IFXNewsPersister newPersistener) {
        this.newPersistener = newPersistener;
    }

    public void getAndPersistNews() {
        System.out.println("====>执行中");
        System.out.println(newsListener.getClass());
        System.out.println(newPersistener.getClass());
        String[] newsIds = newsListener.getAvailableNewsIds();
        if (ArrayUtils.isEmpty(newsIds)) {
            return;
        }

        for (String newsId : newsIds) {
            FXNewsBean newsBean = newsListener.getNewsByPK(newsId);
            newPersistener.persistNews(newsBean);
            newsListener.postProcessIfNecessary(newsId);
        }
    }
}
