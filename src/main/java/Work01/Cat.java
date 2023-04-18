package Work01;

public class Cat extends Animal {
    public Cat(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }

    public Cat(String type, String name, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, weight, isFly, isWalk, isSwim);
    }

    public void Say() {
        System.out.println("Мяу, Мяу");
    }
}
