package top.b0x0.dosomething.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 字符串数组排序
 *
 * @author musui
 */
public class StringSort {
    private static final Logger log = LoggerFactory.getLogger(StringSort.class);

    /**
     * 对字符串数组进行排序
     *
     * @param strArr /
     * @return /
     */
    public static String[] strArraySort(String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = 0; j < strArr.length - i - 1; j++) {
                String pre = strArr[j];
                String next = strArr[j + 1];
                if (isMoreThan(pre, next)) {
                    strArr[j] = next;
                    strArr[j + 1] = pre;
                }
            }
        }
        return strArr;
    }

    /**
     * 比较两个字符串的大小，按字母的ASCII码比较
     *
     * @param pre  /
     * @param next /
     * @return /
     */
    private static boolean isMoreThan(String pre, String next) {
        if (null == pre || null == next || "".equals(pre) || "".equals(next)) {
            log.error("字符串比较数据不能为空！");
            return false;
        }
        char[] cPre = pre.toCharArray();
        char[] cNext = next.toCharArray();
        int minSize = Math.min(cPre.length, cNext.length);
        for (int i = 0; i < minSize; i++) {
            if ((int) cPre[i] > (int) cNext[i]) {
                return true;
            } else if ((int) cPre[i] < (int) cNext[i]) {
                return false;
            }
        }
        return cPre.length > cNext.length;
    }


    public static void main(String[] args) {
        String[] keys = strArraySort(new String[]{"fin", "abc", "shidema", "shide", "bushi"});

        for (String key : keys) {
            System.out.println(key);
        }

    }
}
