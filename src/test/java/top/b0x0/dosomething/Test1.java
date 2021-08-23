package top.b0x0.dosomething;

import org.bouncycastle.asn1.x509.Time;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.b0x0.dosomething.retry.AttachmentFileUtils;
import top.b0x0.dosomething.retry.FileException;

import java.util.concurrent.TimeoutException;

/**
 * @author TANG
 * @since 2021-08-16
 * @since JDK1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = top.b0x0.dosomething.Application.class)
public class Test1 {

    @Autowired
    AttachmentFileUtils attachmentFileUtils;

    @Test
    public void test1() {
//        AttachmentFileUtils attachmentFileUtils = new AttachmentFileUtils();
//        String s = attachmentFileUtils.uploadInformation();
//        System.out.println("s = " + s);
    }

    @Test
    public void test2() {
        try {
            String uploadFile = attachmentFileUtils.uploadFile();
            System.out.println("uploadFile = " + uploadFile);
        } catch (FileException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test3() {
        try {
            String s = null;
            System.out.println("s = " + s.toString());
//            int i = 1 / 0;
        } catch (NullPointerException e) {
            System.err.println("捕获空指针");
        } catch (Exception e) {
            System.err.println("捕获异常");
        }
    }
}
