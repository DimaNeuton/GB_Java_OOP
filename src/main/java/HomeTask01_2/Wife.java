package HomeTask01_2;

public class Wife extends Human{
    public Wife(String name, String status, boolean permit) {
        super(name, status, permit);
    }

    public void givePermit() {
        this.permit = true;
        System.out.printf("%s given permit to open\n", this.name);
    }
}
