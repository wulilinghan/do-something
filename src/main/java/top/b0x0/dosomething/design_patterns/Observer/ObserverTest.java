package top.b0x0.dosomething.design_patterns.Observer;

/**
 * 设计模式 - 行为型模式 - 观察者模式
 * 又称发布-订阅模式（Publish-Subscribe：Pub/Sub）
 * <p>
 * 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * <p>
 * 它是一种通知机制，让发送通知的一方（被观察方）和接收通知的一方（观察者）能彼此分离，互不影响。
 *
 * @author TANG
 * @since 2021-08-03
 * @since JDK1.8
 */
public class ObserverTest {
    public static void main(String[] args) {
        // observer:
        Admin a = new Admin();
        Customer c = new Customer();

        // store:
        Store store = new Store();

        // 注册观察者:
        store.addObserver(a);
        store.addObserver(c);
    }
}
