package Work03_6;
import java.util.function.BinaryOperator;
public class Class1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> inter10 = (x, y) -> (x * y);
        System.out.println(inter10.apply(10, 2));
    }
}
