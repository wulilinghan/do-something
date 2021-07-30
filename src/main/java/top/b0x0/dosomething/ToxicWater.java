package top.b0x0.dosomething;

import java.util.Scanner;

/**
 * 1000瓶水其中有一瓶水有毒，有10只老鼠并且只要老鼠喝了有毒的水必死。请问怎样通过一次实验找出有毒的那瓶水。
 *
 * @author ManJiis
 * @since 2021-07-30
 */
public class ToxicWater {

    /**
     * 水的数目
     */
    public static final int WATER_NUMBER = 1000;
    /**
     * 老鼠的数目
     */
    public static final int MOUSE_NUMBER = 10;

    public static void main(String[] args) {
        int[] water = new int[WATER_NUMBER];
        int[] mouse = new int[MOUSE_NUMBER];
        int i, j;
        String s;
        StringBuilder sb;
        int flag = 1;

        Scanner reader = new Scanner(System.in);

//		System.out.println("请输入老鼠的存活情况，1 表示死了，0表示还活着：");

        for (i = 0; i < MOUSE_NUMBER; i++) {
            System.out.println("请输入第" + i + "老鼠的存活情况(1 表示死了，0表示还活着)");
            mouse[i] = reader.nextInt();
        }

        //mouseNumber只老鼠
        for (i = 0; i < MOUSE_NUMBER; i++) {
            //1000瓶水
            for (j = 0; j < WATER_NUMBER; j++) {
                //将 j 转换为二进制
                s = Long.toBinaryString(j);
                System.out.println(j + " toBinaryString = " + s);
                sb = new StringBuilder(s);
                //将字符串反转
                sb.reverse();
                System.out.println("toBinaryString reverse = " + sb);
                System.out.println("-------------------------");
                //字符串长度
                if (sb.length() >= i + 1) {
                    if (mouse[i] == 1) {
                        //老鼠死了

                        //第i只老鼠喝了第j瓶水
                        if (sb.charAt(i) == '1') {
                            water[j]--;
                        }
                    } else {
                        //老鼠未死
                        if (sb.charAt(i) == '1') {
                            water[j]++;
                        }
                    }
                }
            }
        }
        int min = 0;
        //找出数值最小的water
        for (i = 0; i < WATER_NUMBER; i++) {
            if (water[i] < min) {
                min = water[i];
                flag = i;
            }
        }
        if (min < 0) {
            System.out.println("第瓶" + flag + "瓶水有毒!!!");
        } else {
            System.out.println("第瓶0瓶水有毒!!!");
        }
    }
}