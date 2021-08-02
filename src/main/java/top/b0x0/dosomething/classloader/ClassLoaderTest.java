package top.b0x0.dosomething.classloader;

import org.springframework.web.client.RestTemplate;

/**
 * @author ManJiis
 * @since 2021-07-31
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        ClassLoader loader = ClassLoaderTest.class.getClassLoader();
        int count = 0;
        while (loader != null) {
            count++;
            System.out.println(count + " - classloader: " + loader.toString());
            loader = loader.getParent();
        }
        //1 - classloader: sun.misc.Launcher$AppClassLoader@18b4aac2
        //2 - classloader: sun.misc.Launcher$ExtClassLoader@3a71f4dd
    }

}