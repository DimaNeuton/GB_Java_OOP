package HomeTask02_2;

public class Husband extends Human implements HusbandSkills {
    public Husband(String name, String status) {
        super(name, status);
    }

    @Override
    public void wardOpen(Human wife, Furniture furniture) {
        if (wife.permit && !furniture.isOpened()){
            furniture.condition = "opened";
            System.out.printf("%s had opened %s\n", super.name, furniture.type);
        } else {
            if ((!wife.permit) & !furniture.isOpened()) {
                System.out.printf("%s not letting to open\n", wife.name);
            }
            if (furniture.isOpened() & wife.permit) {
                System.out.printf("%s is already opened\n", furniture.type);
            }
            if ((!wife.permit) && furniture.isOpened()){
                System.out.printf("%s not letting to open and %s is already opened\n", wife.name, furniture.type);
            }
        }
    }
}
