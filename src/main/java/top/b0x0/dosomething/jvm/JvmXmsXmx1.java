package top.b0x0.dosomething.jvm;

/**
 * 获取运行时jvm 堆大小
 *
 * @author ManJiis
 * @since 2021-08-11
 */
public class JvmXmsXmx1 {

    public static void main(String[] args) {
        //返回jvm中的内存总量（字节）
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        //虚拟机将尝试使用最大堆内存
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println("-Xms:" + initialMemory + "m");

        System.out.println("-Xmx:" + maxMemory + "m");


        System.out.println("系统大小：" + initialMemory * 64 / 1024 + "G");
        System.out.println("系统大小：" + maxMemory * 4 / 1024 + "G");

        // 设置-Xms300m -Xmx300m
        // -XX:+PrintGCDetails


        // 堆空间常用参数设置
        //  -XX:+PrintFlagsInitial: 查看所有参数的默认初始值
        //  -XX:+PrintFlagFinal: 查看所有参数的最终值
        //  -Xms:：初始化堆空间内存（默认为物理内存的1/64）
        //  -Xmx: 最大堆空间内存（默认为物理内存的1/4）
        //  -Xmn:设置新生代的大小（初始值及最大值）
        //  -XX:NewRatio: 配置新生代与老年代在堆结构的占比
        //  -XX:SurvivorRatio:设置新生代中 eden和s0、s1空间的比例
        //  -XX:MaxTenuringThreshold:设置新生代垃圾最大的年龄
        //  -XX:+PrintGCDetails:输出详细的gc处理日志
        //  -XX:+PrintGC:输出简要的gc处理日志

    }

}