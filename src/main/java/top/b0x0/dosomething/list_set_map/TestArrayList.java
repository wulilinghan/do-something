package top.b0x0.dosomething.list_set_map;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;

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
        arrayList.add(2, "222");
        System.out.println("arrayList = " + arrayList);
        String s = arrayList.get(4);
        System.out.println("s = " + s);


        ArrayList<String> arr1 = new ArrayList<>();
        arrayList.add("33");
        arrayList.add("2221412");
        arrayList.add("131");
        arrayList.add("114");
        arrayList.add("141");

        ArrayList<String> arr2 = new ArrayList<>();
        arrayList.add("33");
        arrayList.add("2221412");
        arrayList.add("131");
        arrayList.add("114");
        arrayList.add("141");

        // 正序
        boolean isPositiveSequence = true;
        for (int i = 0; i < arr1.size(); i++) {
            if (isPositiveSequence) {
                for (int j = 0; j < arr2.size(); j++) {
                    int l1 = arr1.get(i).length();
                    int l2 = arr2.get(j).length();
                    if (l1 == l2) {
                        System.out.println("正序遍历 i = " + i);
                        arrayList.remove(i);
                        isPositiveSequence = false;
                    }
                }
            } else {
                for (int j = 0; j < arr2.size(); j++) {
                    int l1 = arr1.get(i).length();
                    int l2 = arr2.get(j).length();
                    if (l1 == l2) {
                        System.out.println("反序遍历 i = " + i);
                        arrayList.remove(i);
                        isPositiveSequence = true;
                    }
                }
            }
        }
        ArrayQueue<String> strings = new ArrayQueue<String>(10);


    }
}
