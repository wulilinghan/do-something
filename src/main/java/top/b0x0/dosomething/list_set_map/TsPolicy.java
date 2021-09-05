package top.b0x0.dosomething.list_set_map;

/**
 * @author ManJiis
 * @since 2021-09-01
 * @since JDK1.8
 */
public class TsPolicy {
    private int id;
    private String name;
    private String type;
    private int ageRe;

    public TsPolicy() {
    }

    public TsPolicy(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public TsPolicy(int id, String name, String type, int ageRe) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.ageRe = ageRe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAgeRe() {
        return ageRe;
    }

    public void setAgeRe(int ageRe) {
        this.ageRe = ageRe;
    }

    @Override
    public String toString() {
        return "TsPolicy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", ageRe='" + ageRe + '\'' +
                '}';
    }
}
