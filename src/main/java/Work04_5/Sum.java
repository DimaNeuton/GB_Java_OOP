package Work04_5;

public class Sum {
    int sum;

    <T extends Number> Sum(T arg) {
        this.sum = 0;
        for (int i = 0; i < arg.intValue(); i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}

class SumDemo {
    public static void main(String[] args) {
        Sum ob = new Sum(5.5);
        System.out.println("Сумма от 0 до 5 равна " + ob.getSum());
    }
}