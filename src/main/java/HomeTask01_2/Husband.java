package HomeTask01_2;

public class Husband extends Human{
    public Husband(String name, String status) {
        super(name, status);
    }

    public void wardOpen(Human wife, Furniture furniture) {
        if (wife.permit && !furniture.isOpened()){
            furniture.condition = "opened";
            System.out.printf("%s had opened %s\n", this.name, furniture.type);
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
