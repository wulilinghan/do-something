package top.b0x0.dosomething;

/**
 * 计算机 移位运算符
 *
 * @author ManJiis
 * @since 2021-07-30
 * @since JDK1.8
 */
public class BitOperation {
    public static void main(String[] args) {
        // 带符号左移
        // 在数字没有溢出的前提下，对于正数和负数，左移一位都相当于乘以2的1次方，左移n位就相当于乘以2的n次方。
        // 4 乘 2的3次方
        int left = 4 << 3;
        // 结果: 32
        System.out.println("left = " + left);

        // 带符号右移
        // 右移一位相当于除2，右移n位相当于除以2的n次方。
        // 16 除 2的3次方
        int right = 16 >> 3;
        // 结果: 2
        System.out.println("right = " + right);


        // 无符号左移运算 <<<

        // 无符号右移运算 >>>
        ClassLoader classLoader = BitOperation.class.getClassLoader();
    }
}
