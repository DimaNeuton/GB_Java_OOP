package HomeTask02_2;

public abstract class Human {
    String name;
    String status;
    boolean permit;
    String place;

    public Human(String name, String status, boolean permit) {
        this.name = name;
        this.status = status;
        this.permit = permit;
    }

    public Human(String name, String status, boolean permit, String place) {
        this.name = name;
        this.status = status;
        this.permit = permit;
        this.place = place;
    }

    public Human(String name, String status, String place) {
        this.name = name;
        this.status = status;
        this.place = place;
    }

    public Human(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void catCall(Cat cat, Human human) {         //Позвать кота
        System.out.printf("%s called %s\n", human.name, cat.name);
        cat.place = "near " + human.name;
    }

    public void about() {
        if (!(this.place == null)) {
            System.out.printf("%s is %s. %s\n", this.name, this.status, this.place);
        } else {
            System.out.printf("%s is %s.\n", this.name, this.status);
        }

    }

    public void wardClose(Furniture furniture) {        //Закрыть шкаф
        if (furniture.isOpened()) {
            furniture.condition = "closed";
            System.out.printf("%s closed %s\n", this.name, furniture.type);
        } else {
            System.out.printf("%s is already closed\n", furniture.type);
        }
    }
}
