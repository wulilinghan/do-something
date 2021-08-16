package top.b0x0.dosomething.sort;

import java.util.Arrays;

/**
 * @author TANG
 * @since 2021-08-16
 * @since JDK1.8
 */
public class TestTuoFeng {
    public static void main(String[] args) {

        String a = "NICE_CAMEL";
        String b = "A_Good_IDEA";
        String c = "FaceBook";
        a = toTuoFeng(a);
        b = toTuoFeng(b);
        c = toTuoFeng(c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    protected static String toTuoFeng(String item) {
        item = item.toLowerCase();
        String[] letters = item.split("_");
        System.out.println("letters = " + Arrays.toString(letters));
        String newItem = letters[0];
        for (int i = 0; i < letters.length; i++) {
            newItem = newItem + letters[i].substring(0, 1).toUpperCase() + letters[i].substring(1);
            // nice
        }
        return newItem;
    }
}
