package top.b0x0.dosomething;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射测试
 *
 * @author TANG
 * @since 2021-08-11
 * @since JDK1.8
 */
public class TestReflect {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        String[] strings = {"1","1"};
//        Class<TestHashSet> aClass = TestHashSet.class;
        Class<?> aClass = Class.forName("top.b0x0.dosomething.listsetmap.TestHashSet");
        Method main = aClass.getDeclaredMethod("main", String[].class);
        Object invoke = main.invoke(aClass,(Object) strings);
    }
}

