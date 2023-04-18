package HomeTask01_2;

public class Human {
    String name;
    String status;
    boolean permit;

    public Human(String name, String status, boolean permit) {
        this.name = name;
        this.status = status;
        this.permit = permit;
    }

    public Human(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void catCall(Cat cat, Human human) {
        System.out.printf("%s called %s\n", human.name, cat.name);
        cat.place = "near " + human.name;
    }

    public void about() {
        System.out.printf("%s is %s\n", this.name, this.status);
    }

    public void wardClose(Furniture furniture) {
        if (furniture.isOpened()) {
            furniture.condition = "closed";
            System.out.printf("%s closed %s\n", this.name, furniture.type);
        } else {
            System.out.printf("%s is already closed\n", furniture.type);
        }
    }
}
