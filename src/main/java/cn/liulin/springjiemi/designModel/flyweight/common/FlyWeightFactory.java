package cn.liulin.springjiemi.designModel.flyweight.common;

import java.util.HashMap;
import java.util.Map;

/**
 * cn.liulin.springjiemi.designModel.flyweight.common$
 *
 * @author ll
 * @date 2024-01-23 09:54:37
 **/
public class FlyWeightFactory {
    private Map<String, FlyWeight> map = new HashMap<>(3);
    public FlyWeightFactory() {
        map.put("x", new ConcreteFlyWeight());
        map.put("y", new ConcreteFlyWeight());
        map.put("z", new ConcreteFlyWeight());
    }

    public FlyWeight getFlyWeight(String key) {
        return map.get(key);
    }
}
