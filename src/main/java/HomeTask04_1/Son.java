package HomeTask04_1;

public class Son extends Human implements SingSkill, PaintSkill {
    public Son(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void about() {
        System.out.printf("Сын: имя %s, возраст %d, пол %s\n", super.getName(), super.getAge(), super.getGender());
    }

    @Override
    public void Sing() {
        System.out.printf("%s is singing\n", super.getName());
    }

    @Override
    public void Paint() {
        System.out.printf("%s is painting\n", super.getName());
    }
}
