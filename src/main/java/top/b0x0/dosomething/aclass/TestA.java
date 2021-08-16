package top.b0x0.dosomething.aclass;

import org.bouncycastle.jcajce.provider.symmetric.IDEA;
import top.b0x0.dosomething.pojo.User;

import javax.swing.*;

/**
 * @author TANG
 * @since 2021-08-15
 * @since JDK1.8
 */
public class TestA {
    public static void main(String[] args) {

//        double d = 0.1566;

/*
        String str = "This is a String";
        str.replaceAll("s", "S");==========
        str.replace("s", "S");
        System.out.println("str = " + str);
*/

        TestInterface testInterface = new TestInterfaceImpl();
        // 接口默认方法
        testInterface.defaultMethod();
        // 接口静态方法
        TestInterface.staticMethod();

    }
}




