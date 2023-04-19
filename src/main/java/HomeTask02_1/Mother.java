package HomeTask02_1;

public class Mother extends Human implements PaintSkill{
    public Mother(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void about() {
        System.out.printf("Мать: имя %s, возраст %d, пол %s\n", super.getName(), super.getAge(), super.getGender());
    }

    @Override
    public void Paint() {
        System.out.printf("%s is painting\n", super.getName());
    }
}
