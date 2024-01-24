package cn.liulin.springjiemi.designModel.flyweight.web;

import java.util.HashMap;
import java.util.Map;

/**
 * cn.liulin.springjiemi.designModel.flyweight.web$
 *
 * @author ll
 * @date 2024-01-23 16:59:30
 **/
public class WebSiteFactory {
    private Map<String, WebSite> map = new HashMap<>();
    public WebSite getWebSite(String key) {
        if (!map.containsKey(key)) {
            map.put(key, new ConcreteWebSite(key));
        }
        return map.get(key);
    }

    public int getWebSiteCount() {
        return map.size();
    }
}
