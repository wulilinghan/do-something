package top.b0x0.dosomething.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author TANG
 * @since 2021-08-10
 * @since JDK1.8
 */
public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1111");
        hashSet.add("2222");
        hashSet.add("33333");
        hashSet.add("4");
        System.out.println("linkedList = " + hashSet);
        System.out.println("args = " + Arrays.toString(args));
    }
}
