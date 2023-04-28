package Work05_1;

public class Main {

    public static void main(String[] args) {
        // Коты соревнуются в беге в трех дисциплинах: Городской забег (mod=1), Марафон (mod=2), Спринт (mod=3).
        // У каждого кота есть свои характеристики влияющие на результат забега, каждая характеристика лидирует в своей дисциплине.
        // Характеристики могут задаваться рандомно (но общее количество всегда равно определенному числу) либо вводиться вручную.
        // У кота есть возможность надеть экипировку, улучшающую его характеристики. Статы экипировки задаются рандомно,
        // но общее количество всегда равно определенному числу. Это число зависит от редкости экипировки.
        // Коту можно дать возможность использовать boost (модификатор рандомной характеристики).
        // В процессе забега характеристики двух котов сравниваются определенным образом и в результате определяется победитель.

        Cat c1 = new Cat("Вася", 1.1, false);
        Cat c2 = new Cat("Коля", 1, true);
        Cat c3 = new Cat("Dheodin", 38.4, 33.6, 33.6, 1.1, false);
        Cat c4 = new Cat("Dounsada", 32.8, 30.6, 42.6, 1, false);

        Running.whoWinner(c3, c4, 1);
        System.out.println(c3.toString());
        System.out.println(c4.toString());

        Running.whoWinner(c1, c2, 2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}