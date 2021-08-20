package top.b0x0.dosomething.transient_1;

import java.io.*;

/**
 * 使用 transient 关键字不序列化某个变量
 * 注意读取的时候，读取数据的顺序一定要和存放数据的顺序保持一致
 *
 * @author Alexia
 * @date 2013-10-15
 */
public class TransientTest {

    public static void main(String[] args) {

        User user = new User();
        user.setUsername("ManJiis");
        user.setPasswd("123456");

        System.out.println("read before Serializable: ");
        System.out.println("username: " + user.getUsername());
        System.err.println("password: " + user.getPasswd());

        // 1. 将user数据写入文件
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/user.txt"));

            // 将User对象写进文件
            oos.writeObject(user);

            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2。 将user数据从文件中读取出来
        try {
            // 在反序列化之前改变username的值
            User.username = "ManJiis222";

            ObjectInputStream oip = new ObjectInputStream(new FileInputStream("d:/user.txt"));

            // 从流中读取User的数据
            user = (User) oip.readObject();
            oip.close();

            System.out.println("\nread after Serializable: ");
            System.out.println("username: " + user.getUsername());
            System.err.println("password: " + user.getPasswd());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {
    private static final long serialVersionUID = 8294180014912103005L;

    public static String username;
    private transient String passwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        User.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}