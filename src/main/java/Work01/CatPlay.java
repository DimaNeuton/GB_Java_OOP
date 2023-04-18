package Work01;

public class CatPlay {
    public static void main(String[] args) {
        Cat cat = new Cat("кот", "Артем", 300.6, false, true, true);
        cat.Say();

        Cat2 cat2 = new Cat2("котенок", "Антон", 300.6, false, true, true);
        cat2.Say();
    }
}
