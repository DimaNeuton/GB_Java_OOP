package HomeTask01_1;

public class Father extends Human{
    public Father(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void Sing() {
        System.out.printf("%s is singing\n", this.name);

    }
}
