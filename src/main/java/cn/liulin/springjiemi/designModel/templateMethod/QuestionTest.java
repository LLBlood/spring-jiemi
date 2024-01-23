package cn.liulin.springjiemi.designModel.templateMethod;

/**
 * cn.liulin.springjiemi.designModel.templateMethod$
 *
 * @author ll
 * @date 2024-01-17 14:39:24
 **/
public class QuestionTest {
    public static void main(String[] args) {
        Question question1 = new Student1();
        Question question2 = new Student2();
        question1.question1();
        question1.question2();
        question2.question1();
        question2.question2();
    }
}
