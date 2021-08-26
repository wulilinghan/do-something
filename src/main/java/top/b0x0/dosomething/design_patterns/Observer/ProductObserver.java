package top.b0x0.dosomething.design_patterns.Observer;

/**
 * @author TANG
 * @since 2021-08-03
 * @since JDK1.8
 */
public interface ProductObserver {
    void onPublished(Product product);

    void onPriceChanged(Product product);
}
