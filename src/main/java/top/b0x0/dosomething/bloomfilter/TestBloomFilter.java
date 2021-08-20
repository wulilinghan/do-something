package top.b0x0.dosomething.bloomfilter;

/**
 * 测试布隆过滤器
 *
 * @author TANG
 * @since 2021-08-20
 * @since JDK1.8
 */
public class TestBloomFilter {
    public static void main(String[] args) {
        MyBloomFilter myNewBloomFilter = new MyBloomFilter();
        myNewBloomFilter.add("张学友");
        myNewBloomFilter.add("郭德纲");
        myNewBloomFilter.add("蔡徐鸡");
        myNewBloomFilter.add(666);
        System.out.println(myNewBloomFilter.isContain("张学友")); // true
        System.out.println(myNewBloomFilter.isContain("张学友 ")); // false
        System.out.println(myNewBloomFilter.isContain("张学友1")); // false
        System.out.println(myNewBloomFilter.isContain("郭德纲")); // true
        System.out.println(myNewBloomFilter.isContain("蔡徐老母鸡")); // false
        System.out.println(myNewBloomFilter.isContain(666)); // true
        System.out.println(myNewBloomFilter.isContain(888)); // false
    }
}
