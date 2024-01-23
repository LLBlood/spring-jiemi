package cn.liulin.springjiemi.designModel.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * cn.liulin.springjiemi.designModel.builder$
 *
 * @author ll
 * @date 2024-01-17 15:21:26
 **/
public class Product {
    private List<String> list = new ArrayList<>();
    public void add(String a) {
        list.add(a);
    }
    public void show() {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
