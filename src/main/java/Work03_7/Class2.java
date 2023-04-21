package Work03_7;
import java.util.function.UnaryOperator;

public class Class2 {
    public static void main(String[] args) {
        UnaryOperator<Integer> unary = x -> x * x;
        System.out.println(unary.apply(5));
    }

}
