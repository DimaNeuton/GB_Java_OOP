package Work04_2;

public class Numeric<T extends Number> {
    T num;

    public Numeric(T num) {
        this.num = num;
    }

    Double getNum() {
        return 1/num.doubleValue();
    }

    Double getNum2() {
        return num.doubleValue() - num.intValue();
    }
}
