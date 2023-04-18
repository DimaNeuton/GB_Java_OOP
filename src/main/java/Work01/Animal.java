package Work01;

public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public Animal(String type, String name, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public String display() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isFly=" + isFly +
                ", isWalk=" + isWalk +
                ", isSwim=" + isSwim +
                '}';
    }

    public void rename(String name) {
        this.name = name;
    }
}
