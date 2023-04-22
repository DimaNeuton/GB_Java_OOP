package Work04_1;

public class Main {
    public static void main(String[] args) {
        Gen<Integer, String> ob = new Gen<>(88, "text");
        ob.showType();

        System.out.println(ob.getOb());
        System.out.println(ob.getOb2());


    }
}
