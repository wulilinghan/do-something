package top.b0x0.dosomething.proxy.jdk;

import cn.hutool.core.lang.Console;

public class Cat implements Animal{

    @Override
    public void eat() {
        Console.log("猫吃鱼");
    }
    
}