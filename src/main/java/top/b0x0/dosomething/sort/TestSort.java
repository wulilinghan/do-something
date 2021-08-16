package top.b0x0.dosomething.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author TANG
 * @since 2021-08-16
 * @since JDK1.8
 */
public class TestSort {

    public static void main(String[] args) {

        int[] scores = {67, 100, 50, 99, 90, 75};

        sort1(scores);
        System.out.println("scores = " + Arrays.toString(scores));
    }

    /**
     * 冒泡排序
     *
     * @param arr /
     */
    public static void sort1(int[] arr) {
        // 冒泡
        for (int i = 0; i < arr.length; i++) {
            // 外层循环，遍历次数
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 内层循环，升序（如果前一个值比后一个值大，则交换）
                // 内层循环一次，获取一个最大值
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 插入排序
     *
     * @param arr /
     */
    public static void sort2(int[] arr) {
        // 插入排序
        for (int i = 1; i < arr.length; i++) {
            // 外层循环，从第二个开始比较
            for (int j = i; j > 0; j--) {
                // 内存循环，与前面排好序的数据比较，如果后面的数据小于前面的则交换
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    // 如果不小于，说明插入完毕，退出内层循环
                    break;
                }
            }
        }
    }

}
