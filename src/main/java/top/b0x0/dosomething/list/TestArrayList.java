package top.b0x0.dosomething.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author TANG
 * @since 2021-08-10
 * @since JDK1.8
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1111");
        arrayList.add("2222");
        arrayList.add("33333");
        arrayList.add("4");
        arrayList.add(2,"222");
        System.out.println("arrayList = " + arrayList);
        String s = arrayList.get(4);
        System.out.println("s = " + s);


    }
}
