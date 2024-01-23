package cn.liulin.springjiemi.designModel.templateMethod;

/**
 * cn.liulin.springjiemi.designModel.templateMethod$
 *
 * @author ll
 * @date 2024-01-17 14:36:39
 **/
public abstract class Question {
    public void question1() {
        System.out.println("赵子龙七进七出带的谁");
        System.out.println("带的是" + answer1());
    }

    public void question2() {
        System.out.println("长坂坡是谁");
        System.out.println("是" + answer2());
    }

    protected abstract String answer1();

    protected abstract String answer2();
}
