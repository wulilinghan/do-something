package top.b0x0.dosomething.proxy.jdk;

import cn.hutool.aop.ProxyUtil;
import cn.hutool.aop.aspects.TimeIntervalAspect;

/**
 * jdk 动态代理
 *
 * @author ManJiis
 * @since 2021-08-26
 * @since JDK1.8
 */
public class TestProxyJdk {
    public static void main(String[] args) {
        Animal cat = ProxyUtil.proxy(new Cat(), TimeIntervalAspect.class);
        cat.eat();
    }
}
