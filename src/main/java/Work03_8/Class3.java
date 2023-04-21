package Work03_8;

import java.util.function.Function;

public class Class3 {
    public static void main(String[] args) {
        Function<Integer, String> inter30 = x -> (String.valueOf(x) + " долларов");
        System.out.println(inter30.apply(10));
    }
}
