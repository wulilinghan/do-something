package top.b0x0.dosomething.proxy.cglib;

import cn.hutool.aop.ProxyUtil;
import cn.hutool.aop.aspects.TimeIntervalAspect;

/**
 * cglib 代理
 *
 * @author ManJiis
 * @since 2021-08-26
 * @since JDK1.8
 */
public class TestProxyCglib {
    public static void main(String[] args) {
        Dog dog = ProxyUtil.proxy(new Dog(), TimeIntervalAspect.class);
        String result = dog.eat();
        System.out.println("result = " + result);
    }
}
