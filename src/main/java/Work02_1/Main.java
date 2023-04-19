package Work02_1;

public class Main {
    public static void main(String[] args) {
        NumTest num = new NumTest();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Следующее значение" + num.getNext());
//        }
//        System.out.println("Сброс");
//        num.reset();
//        System.out.println("Начальное значение - 100");
//        num.setStart(100);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Следующее значение" + num.getNext());
//        }
        NumTest2 num2 = new NumTest2();

        Test ob;

        for (int i = 0; i < 5; i++) {
            ob = num2;
            System.out.println("Следующее значение" + ob.getNext());
            ob = num;
            System.out.println("Следующее значение" + ob.getNext());
        }
    }
}
