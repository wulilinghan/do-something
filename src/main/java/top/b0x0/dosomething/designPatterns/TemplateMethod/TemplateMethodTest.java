package top.b0x0.dosomething.designPatterns.TemplateMethod;

/**
 * 设计模式 - 行为型模式 - 模板方法（Template Method）
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * <p>
 * 它的主要思想是，定义一个操作的一系列步骤，对于某些暂时确定不下来的步骤，就留给子类去实现好了，这样不同的子类就可以定义出不同的步骤。
 * <p>
 * 因此，模板方法的核心在于定义一个“骨架”。
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        StudyAbroad tm = new top.b0x0.dosomething.designPatterns.TemplateMethod.StudyInAmerica();
        tm.TemplateMethod();
    }
}