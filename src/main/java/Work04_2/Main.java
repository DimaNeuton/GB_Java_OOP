package Work04_2;

public class Main {
    public static void main(String[] args) {
        Numeric<Integer> ob = new Numeric<>(5);
        System.out.println("обратная величина ob " + ob.getNum());
        System.out.println("Дробная часть ob " + ob.getNum2());

        Numeric<Double> ob2 = new Numeric<>(5.2);
        System.out.println("обратная величина ob " + ob2.getNum());
        System.out.println("Дробная часть ob " + ob2.getNum2());

//        Numeric<String> ob3 = new Numeric<String>("text");
    }
}
