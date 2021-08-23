package top.b0x0.dosomething.future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @author ManJiis
 * @since 2021-08-23
 * @since JDK1.8
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("user")
    public void getName(String name) {
        try {
            Future<String> name1 = userService.getName(name);
            System.out.println("name1 = " + name1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


