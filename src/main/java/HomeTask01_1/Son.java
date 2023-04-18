package HomeTask01_1;

public class Son extends Father{
    public Son(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void Paint() {
        System.out.printf("%s is painting\n", this.name);

    }
}
