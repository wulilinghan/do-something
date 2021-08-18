package top.b0x0.dosomething.enums.TestEnum;

/**
 * @author TANG
 * @since 2021-08-18
 * @since JDK1.8
 */
public enum TestEnum {

    /**
     *
     */
    value1(500, "unknownAbnormal"),
    value2(500, "文件太大"),
    ;

    public int code;
    public String msg;

    TestEnum(int i, String msg) {

    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static void main(String[] args) {
        int code = TestEnum.value1.code;
        TestEnum value2 = TestEnum.valueOf("value2");
        int value2Code = value2.getCode();
        System.out.println("value2 = " + value2Code);
        String value2Msg = value2.getMsg();
        System.out.println("value2Msg = " + value2Msg);
    }

}
