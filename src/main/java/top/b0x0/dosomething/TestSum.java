package top.b0x0.dosomething;

import org.aspectj.weaver.ast.Var;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author TANG
 * @since 2021-08-12
 * @since JDK1.8
 */
public class TestSum {
    public static void main(String[] args) {

        int[] ints = new int[100];
        for (int i = 1; i <= 100; i++) {
            ints[i - 1] = i;
        }

        int enter = 8;

        List<String> vos = new ArrayList<>();
        for (int anInt : ints) {
            for (int i : ints) {
                int tmpSum = anInt + i;
                if (enter == tmpSum) {
                    String s = "" + i + anInt;
//                    System.out.println(anInt + "+" + i + "=" + tmpSum);
//                    System.out.println("s = " + s);
                    vos.add(s);
                }
            }
        }
        System.out.println("vos = " + vos);

        for (int i = 0; i < vos.size(); i++) {
            String s = vos.get(i);
            for (int j = 0; j < vos.size(); j++) {
                String s1 = vos.get(j);
                StringBuilder reverse1 = new StringBuilder(s1).reverse();
                if (s.equals(reverse1.toString())) {
                    vos.remove(i);
                }
            }
        }

        for (int i = 0; i < vos.size(); i++) {
            String string = vos.get(i);
            String[] split = string.split("");
            if (split[0].equals(split[1])) {
                vos.remove(string);
            }
        }

        System.out.println("vos = " + vos);

    }
}


