package top.b0x0.dosomething.list_set_map;

/**
 * @author ManJiis
 * @since 2021-09-01
 * @since JDK1.8
 */
public class TestA {
    public static void main(String[] argv) {
/*
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
*/

        for (int i = 1; i < 10; i++) {
            for (int j = 2; i < 10; j++) {
                int sum = i + j;
                System.out.println("------- " );
                System.out.println(i + " + " + j + " = " + sum);

                int sumMod = sum / 2;
                if (sumMod == 0) {
                    continue;
                }
                System.out.println(i + " + " + j + " = " + sum);
            }
        }
    }
}
