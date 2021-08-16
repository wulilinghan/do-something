package top.b0x0.dosomething.aclass;


/**
 * 测试接口
 * 方法默认都是 public abstract
 * 变量默认都是常量 public static final
 * 使用default修饰方法  方法不强制重写
 */
public interface TestInterface {
    default void test() {
        System.out.println("true = " + true);
    }

    // 使用abstract修饰不修饰都行
    void sayHi();

    public static final int i = 1;

    public abstract void say();

}