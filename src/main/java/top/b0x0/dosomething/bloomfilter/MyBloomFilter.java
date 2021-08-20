package top.b0x0.dosomething.bloomfilter;

import java.util.Arrays;
import java.util.BitSet;

/**
 * 布隆过滤器
 *
 * @author TANG
 * @since 2021-08-21
 * @since JDK1.8
 */
public class MyBloomFilter {
    /**
     * 布隆过滤器默认容量
     */
    private static final int DEFAULT_SIZE = 2 << 28;

    /**
     * bit数组，用来存放key
     */
    private static BitSet bitSet = new BitSet(DEFAULT_SIZE);

    /**
     * 扰动因子
     * 后面hash函数会用到，用来生成不同的hash值，可随意设置，别问我为什么这么多8，图个吉利
     */
    private static final int[] DISTURBANCE_FACTOR = {1, 6, 16, 38, 58, 68};

    /**
     * add方法，计算出key的hash值，并将对应下标置为true
     *
     * @param key /
     */
    public void add(Object key) {
        Arrays.stream(DISTURBANCE_FACTOR).forEach(i -> bitSet.set(hash(key, i)));
    }

    /**
     * 判断key是否存在，true不一定说明key存在，但是false一定说明不存在
     *
     * @param key /
     * @return /
     */
    public boolean isContain(Object key) {
        boolean result = true;
        for (int i : DISTURBANCE_FACTOR) {
            // 短路与，只要有一个bit位为false，则返回false
            result = result && bitSet.get(hash(key, i));
        }
        return result;
    }


    /**
     * hash函数，借鉴了hashmap的扰动算法，强烈建议大家把这个hash算法看懂，这个设计真的牛皮加闪电
     *
     * @param key /
     * @param i   /
     * @return /
     */
    private int hash(Object key, int i) {
        int h;
        return key == null ? 0 : (i * (DEFAULT_SIZE - 1) & ((h = key.hashCode()) ^ (h >>> 16)));
    }
}
