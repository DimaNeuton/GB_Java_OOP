package HomeTask01_2;

public class Cat{
    String name;
    String place;

    public Cat(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public void about() {
        System.out.printf("Cat %s %s\n", this.name, this.place);
    }
}
