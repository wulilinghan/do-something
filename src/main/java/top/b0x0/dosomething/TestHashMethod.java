package top.b0x0.dosomething;

import org.apache.commons.codec.binary.Hex;
import top.b0x0.dosomething.encryption.utils.ShaUtils;
import top.b0x0.dosomething.pojo.User;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

/**
 * hash方法测试
 *
 * @author TANG
 * @since 2021/08/09
 */
public class TestHashMethod {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        User user = new User();
        user.setId("0755-1111");
        user.setAge(90);
        user.setName("小红");
        String key = user.toString(); // ba67e1681d37eb98027e74de16722e5bea87b3cf

//        Provider[] providers = Security.getProviders();
//        System.out.println("providers = " + Arrays.toString(providers));

        MessageDigest md = MessageDigest.getInstance("SHA");
        md.update(key.getBytes());
        String hexString = Hex.encodeHexString(md.digest());

        System.out.println("hexString = " + hexString);
    }
}

