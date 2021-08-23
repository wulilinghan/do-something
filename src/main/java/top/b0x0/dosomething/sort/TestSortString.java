package top.b0x0.dosomething.sort;

import java.util.Arrays;

/**
 * @author ManJiis
 * @since 2021-08-23
 * @since JDK1.8
 */
public class TestSortString {
    public static void main(String[] args) {

        String s = "ABCED";
        String s1 = ASCIISort(s);
        System.out.println("s1 = " + s1);
    }


    public static String ASCIISort(String str) {
        char[] test = new char[str.length()];
        StringBuilder sb = new StringBuilder();
        while (true) {
            //直接读取这行当中的字符串。
            String a = str;
            for (int i = 0; i < str.length(); i++) {
                //字符串处理每次读取一位。
                test[i] = a.charAt(i);
            }
            Arrays.sort(test);
            for (int i = 0; i < test.length; i++) {
                sb.append(test[i]);
            }
            String trim = sb.toString().trim();
            return trim;
        }
    }
}
