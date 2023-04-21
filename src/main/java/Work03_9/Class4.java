package Work03_9;
import java.util.function.Consumer;
public class Class4 {
    public static void main(String[] args) {
        Consumer<Integer> inter40 = (x) -> System.out.printf(" %d $%n", x);
        inter40.accept(10);
    }
}
