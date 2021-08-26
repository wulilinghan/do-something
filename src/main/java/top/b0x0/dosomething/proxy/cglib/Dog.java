package top.b0x0.dosomething.proxy.cglib;

import cn.hutool.core.lang.Console;

public class Dog {
    public String eat() {
        Console.log("狗吃肉");
        return "dag eat ..";
    }
}