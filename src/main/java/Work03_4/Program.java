package Work03_4;

public class Program {
    public static void main(String[] args) {
        MyInterface<Integer> myInterface = (n, m) -> (n%m == 0);
        if (myInterface.test(10, 2)) {
            System.out.println("2 является делителем 10");
        }
        MyInterface<Double> myInterface2 = (n, m) -> (n%m == 0);
        if (myInterface2.test(10.5, 0.5)) {
            System.out.println("0.5 является делителем 10.5");
        }
        MyInterface<String> myInterface3 = (n, m) -> (n.contains(m));
        String str = "обобщенный интерфейс";
        if (myInterface3.test(str, "о")) {
            System.out.println("найдено");
        }
    }

}
