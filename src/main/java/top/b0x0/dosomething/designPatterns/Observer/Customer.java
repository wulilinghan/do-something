package top.b0x0.dosomething.designPatterns.Observer;

/**
 * 消费者
 *
 * @author TANG
 * @since 2021-08-03
 * @since JDK1.8
 */
public class Customer implements ProductObserver {
    @Override
    public void onPublished(Product product) {

    }

    @Override
    public void onPriceChanged(Product product) {

    }
}
