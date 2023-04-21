package HomeTask02_1;

public class Father extends Human implements SingSkill, IsLegalAge{
    public Father(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void about() {
        System.out.printf("Отец: имя %s, возраст %d, пол %s\n", super.getName(), super.getAge(), super.getGender());
    }

    @Override
    public void Sing() {
        System.out.printf("%s is singing\n", super.getName());
    }

    @Override
    public Object isLegalAge(Object age) {
        return null;
    }
}
