package HomeTask01_1;

//        1. Реализовать, с учетом ооп подхода, генеалогическое дерево Человек.
//        Идея: описать некоторое количество компонентов, например:
//        - модель человека
//        - компонент хранения связей и отношений между людьми: родитель, ребёнок. Можно подумать
//        и про отношение, брат, свекровь, сестра и т. д.
//        - компонент для проведения исследований
//        - дополнительные компоненты по желанию, например отвечающие за вывод данных в консоль, загрузку
//        и сохранения в файл, получение\построение отдельных моделей человека
//        Под “проведением исследования” можно понимать получение всех детей выбранного человека.
//        Не обязательное


public class Task01 {
    public static void main(String[] args) {
        Human h1 = new Human("Sam", 20, "male");
        h1.Speak();         // Может говорить
        h1.Walk();          // Может ходить
        Father f1 = new Father("John", 42, "male");     // Наследует все от Human
        f1.Speak();         // Может говорить
        f1.Walk();          // Может ходить
        f1.Sing();          // Может петь
        //f1.Paint();   Не доступно в родительском классе
        Son s1 = new Son("Ric", 15, "male");            // Наследует от Father и соответственно от Human
        s1.Speak();         // Может говорить
        s1.Walk();          // Может ходить
        s1.Sing();          // Может петь
        s1.Paint();         // Может рисовать
    }
}
