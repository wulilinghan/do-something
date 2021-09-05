package top.b0x0.dosomething.list_set_map;

/**
 * @author ManJiis
 * @since 2021-09-01
 * @since JDK1.8
 */
public class TsUser {
    private int id;
    private int age;
    private String name;

    public TsUser() {
    }

    public TsUser(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TsUser{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
