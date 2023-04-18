package HomeTask01_1;

public class Human {
    String name;
    int age;
    String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void Speak() {
        System.out.printf("%s is speaking\n", this.name);
    }

    public void Walk() {
        System.out.printf("%s is walking\n", this.name);
    }


}
