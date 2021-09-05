package top.b0x0.dosomething.list_set_map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        linkedList.add(2, "222");
        System.out.println("linkedList = " + linkedList);
        String s = linkedList.get(4);
        System.out.println("s = " + s);

        List<TsPolicy> policies = new ArrayList<>();
        policies.add(new TsPolicy(1001, "测试保单一", "一", 18));
        policies.add(new TsPolicy(1002, "测试保单二", "二", 18));
        policies.add(new TsPolicy(1003, "测试保单二", "二", 17));
        policies.add(new TsPolicy(1004, "测试保单四", "四", 20));
        policies.add(new TsPolicy(1005, "测试保单五", "五", 16));

        List<TsUser> users = new LinkedList<>();
        users.add(new TsUser(1, 14, "散散"));
        users.add(new TsUser(2, 20, "阿达"));
        users.add(new TsUser(3, 18, "阿斗"));
        users.add(new TsUser(4, 17, "发的"));

        int count = 0;
        for (TsPolicy policy : policies) {
            int ageRe = policy.getAgeRe();
            for (TsUser user : users) {
                int age = user.getAge();
                count++;
                if (ageRe == age) {
                    break;
                }
            }
        }
        System.out.println("count = " + count);

    }
}

