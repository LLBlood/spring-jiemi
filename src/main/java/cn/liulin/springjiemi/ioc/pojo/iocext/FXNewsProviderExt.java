package cn.liulin.springjiemi.pojo.iocext;

import cn.liulin.springjiemi.ioc.pojo.iocext.FXNewsBeanExt;
import cn.liulin.springjiemi.ioc.pojo.iocext.IFXNewsListenerExt;
import cn.liulin.springjiemi.ioc.pojo.iocext.IFXNewsPersisterExt;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * cn.liulin.springjiemi.pojo.ioc$
 * FX全称为“Foreign Exchange”,外汇交易
 *
 * @author ll
 * @date 2023-12-28 10:20:20
 **/
public class FXNewsProviderExt {
    @Autowired
    private IFXNewsListenerExt newsListener;

    @Autowired
    private IFXNewsPersisterExt newPersistener;

    /**
     * ioc 构造方法注入
     * @param newsListner
     * @param newsPersister
     */
    public FXNewsProviderExt(IFXNewsListenerExt newsListner, IFXNewsPersisterExt newsPersister) {
        this.newsListener = newsListner;
        this.newPersistener = newsPersister;
    }

    public IFXNewsListenerExt getNewsListener() {
        return newsListener;
    }

    /**
     * ioc setter方法注入
     * @param newsListener
     */
    public void setNewsListener(IFXNewsListenerExt newsListener) {
        this.newsListener = newsListener;
    }

    public IFXNewsPersisterExt getNewPersistener() {
        return newPersistener;
    }

    public void setNewPersistener(IFXNewsPersisterExt newPersistener) {
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
            FXNewsBeanExt newsBean = newsListener.getNewsByPK(newsId);
            newPersistener.persistNews(newsBean);
            newsListener.postProcessIfNecessary(newsId);
        }
    }
}
