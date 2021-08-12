package top.b0x0.dosomething.list;

import java.util.LinkedList;

/**
 * @author TANG
 * @since 2021-08-10
 * @since JDK1.8
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1111");
        linkedList.add("2222");
        linkedList.add("33333");
        linkedList.add("4");
        linkedList.add(2,"222");
        System.out.println("linkedList = " + linkedList);
        String s = linkedList.get(4);
        System.out.println("s = " + s);


    }
}
