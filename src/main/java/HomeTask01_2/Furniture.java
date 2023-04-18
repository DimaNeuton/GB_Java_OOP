package HomeTask01_2;

public class Furniture {
    String type;
    String condition;

    public Furniture(String type, String condition) {
        this.type = type;
        this.condition = condition;
    }

    public void about() {
        System.out.printf("%s is %s\n", this.type, this.condition);
    }

    public boolean isOpened() {
        return this.condition.equals("opened");
    }
}
