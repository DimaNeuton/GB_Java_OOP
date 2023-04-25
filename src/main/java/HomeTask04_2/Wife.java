package HomeTask04_2;

public class Wife extends Human implements WifeSkills {
    public Wife(String name, String status, boolean permit) {
        super(name, status, permit);
    }

    @Override
    public void givePermit() {
        this.permit = true;
        System.out.printf("%s given permit to open\n", super.name);
    }
}
