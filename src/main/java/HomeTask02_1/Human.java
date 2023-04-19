package HomeTask02_1;

public abstract class Human{
    private String name;
    private int age;
    private String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void Speak() {
        System.out.printf("%s is speaking\n", this.name);
    }

    public void Walk() {
        System.out.printf("%s is walking\n", this.name);
    }

    public abstract void about();

}
