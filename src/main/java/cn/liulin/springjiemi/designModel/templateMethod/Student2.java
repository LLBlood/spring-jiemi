package cn.liulin.springjiemi.designModel.templateMethod;

/**
 * cn.liulin.springjiemi.designModel.templateMethod$
 *
 * @author ll
 * @date 2024-01-17 14:38:39
 **/
public class Student2 extends Question {
    @Override
    protected String answer1() {
        return "阿备";
    }

    @Override
    protected String answer2() {
        return "张翼德";
    }
}
