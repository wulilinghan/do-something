package top.b0x0.dosomething.designPatterns.Observer;

/**
 * 产品
 *
 * @author TANG
 * @since 2021-08-03
 * @since JDK1.8
 */
public class Product {

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
