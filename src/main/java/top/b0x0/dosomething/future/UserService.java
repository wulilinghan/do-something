package top.b0x0.dosomething.future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author ManJiis
 * @since 2021-08-23
 * @since JDK1.8
 */
@Component
public class UserService {

    @Async
    public Future<String> getName(String name) throws InterruptedException {
        Thread.sleep(1000);
        return new AsyncResult<>(System.currentTimeMillis() + name);
    }
}
