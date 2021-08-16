package top.b0x0.dosomething.listsetmap;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author TANG
 * @since 2021-08-10
 * @since JDK1.8
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("1111");
        treeSet.add("2222");
        treeSet.add("33333");
        treeSet.add("4");
        System.out.println("treeSet = " + treeSet);
        System.out.println("args = " + Arrays.toString(args));
    }
}
