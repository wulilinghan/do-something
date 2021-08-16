package top.b0x0.dosomething.aclass;

/**
 * 测试抽象类
 */
public abstract class TestAbstractClass {

    // Extension methods can only be used within an interface
//    default void test() {
//        System.out.println("true = " + true);
//    }

    public static final int i = 1;

    private void say() {

    }

    protected void aaa() {

    }

    // 抽象类中必须是抽象方法
    public abstract void say(String id);

}