package top.b0x0.dosomething.retry;

import org.springframework.aop.framework.AopContext;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.concurrent.TimeoutException;

/**
 * @author TANG
 * @since 2021-08-16
 * @since JDK1.8
 */
@Component
public class AttachmentFileUtils {

    private int num = 1;

    //    @Retryable(maxAttempts = 2, value = TimeoutException.class, backoff = @Backoff(delay = 1000L, multiplier = 1.5))
    @Retryable(maxAttempts = 5, value = Exception.class)
    public String uploadFile() throws FileException {
//        System.out.println(LocalTime.now() + " **** 第" + num + "次上传文件....");
        num++;
        // 模拟： 前四次执行都出异常了 第五次成功了
        if (num < 5) {
            System.out.println(num + "——上传文件__接口调用超时异常。。。。重试中。。。");
            throw new FileException("上传文件__接口调用超时异常..." + num);
        }

        // 模拟： 方法执行一直失败..最后抛出FileException
//        if (num < 6) {
//            throw new FileException("上传文件失败...");
//        }
        System.out.println(num + "——上传文件成功。。。");
        return "file_name";
    }


//    public String uploadInformation() {
//        int i = 0;
//        AttachmentFileUtils currentProxy = (AttachmentFileUtils) AopContext.currentProxy();
//        try {
//            currentProxy.uploadFile();
//            return String.valueOf(i);
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//            i++;
//        }
//        return String.valueOf(i);
//
//    }

}
