package top.b0x0.dosomething.future;

import java.util.concurrent.Callable;

/**
 * @author ManJiis
 * @since 2021-08-23
 * @since JDK1.8
 */
public class FuTask implements Callable<String> {

    private String pre;

    public FuTask() {
    }

    public FuTask(String pre) {
        this.pre = pre;
    }

    @Override
    public String call() throws Exception {
        String result = "";
        if ("张三丰".equals(pre)) {
            result = pre + "处理完成";
        }
        return result;
    }
}
