package top.b0x0.dosomething.guava;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ManJiis
 * @since 2021-08-23
 * @since JDK1.8
 */
public class TestA {
    public static void main(String[] args) {
        List<Object> objects = Collections.emptyList();
        System.out.println("objects = " + objects);

        ArrayList<Object> objects1 = Lists.newArrayList();
        System.out.println("objects1 = " + objects1);

        ArrayList<Object> objects2 = new ArrayList<>();
        System.out.println("objects2 = " + objects2);
    }
}
