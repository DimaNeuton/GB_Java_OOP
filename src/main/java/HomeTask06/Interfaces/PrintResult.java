package HomeTask06.Interfaces;

import HomeTask06.Cat;

public interface PrintResult {

    // Печать подробностей забега
    void printResult(Cat cat1, Cat cat2, double[] resStats1, double[] resStats2);

    // Сложение элементов списка
    static double sumListElements(double[] list) {
        return list[0] + list[1] + list[2];
    }
}
