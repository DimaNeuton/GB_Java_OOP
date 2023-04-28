package Work05_1;

import java.util.Random;

public interface Running {

    // Сравнение очков бегунов и определение выигравшего в забеге
    static void whoWinner(Cat cat1, Cat cat2, int mod) {
        double[] resultStats1 = pointSum(cat1, mod);
        double[] resultStats2 = pointSum(cat2, mod);
        // Печать результатов забега
        printResult(cat1, cat2, mod, resultStats1, resultStats2);
        if (sumListElements(resultStats1) > sumListElements(resultStats2)) {
            System.out.println("Победитель -> " + cat1.getName());
        } else if ((sumListElements(resultStats1) < sumListElements(resultStats2))) {
            System.out.println("Победитель -> " + cat2.getName());
        } else {
            System.out.println("Ничья");
        }
    }

    static void printResult(Cat cat1, Cat cat2, int mod, double[] resStats1, double[] resStats2) {
        System.out.printf(
                """
                        Имя             %s\t%s
                        Сила            %.1f\t%.1f
                        Выносливость    %.1f\t%.1f
                        Скорость        %.1f\t%.1f
                        Общее           %.1f\t%.1f
                        """,
                        cat1.getName(), cat2.getName(),
                        resStats1[0], resStats2[0],
                        resStats1[1], resStats2[1],
                        resStats1[2], resStats2[2],
                        sumListElements(resStats1), sumListElements(resStats2));

    }
    static double sumListElements(double[] list) {
        return list[0] + list[1] + list[2];
    }

    // Определение очков бегуна для сравнения при забеге
    static double[] pointSum(Cat cat, int mod) {
        if (cat.equipmentAvailability()) {
            // 1. Очки при использовании экипировки
            Equipment equip = new Equipment(3);
            double[] stats = {cat.power + equip.power, cat.stamina + equip.stamina, cat.speed + equip.speed};
            stats[mod-1] = stats[mod-1] * 1.1;
            Random r1 = new Random();
            int randBoost = r1.nextInt(1,3);
            switch (randBoost) {
                case 1 -> {
                    stats[0] = stats[0] * cat.boost;
                    break;
                }
                case 2 -> {
                    stats[1] = stats[1] * cat.boost;
                    break;
                }
                case 3 -> {
                    stats[2] = stats[2] * cat.boost;
                    break;
                }
            }
            return stats;
        } else {
            // 2. Очки без использования экипировки
            double[] stats = {cat.power, cat.stamina, cat.speed};
            stats[mod-1] = stats[mod-1] * 1.1;
            Random r1 = new Random();
            int randBoost = r1.nextInt(1,4);
            switch (randBoost) {
                case 1 -> {
                    stats[0] = stats[0] * cat.boost;
                    break;
                }
                case 2 -> {
                    stats[1] = stats[1] * cat.boost;
                    break;
                }
                case 3 -> {
                    stats[2] = stats[2] * cat.boost;
                    break;
                }
            }
            return stats;
        }
    }
}

//    static double pointSum(Cat cat, Equipment equip, int mod) {
//        double sum;
//        double totalPower;
//        double totalStamina;
//        double totalSpeed;
//        totalPower = (cat.power + equip.power) * cat.boost;
//        totalStamina = (cat.stamina + equip.stamina) * cat.boost;
//        totalSpeed = (cat.speed + equip.speed) * cat.boost;
//        sum = totalPower + totalStamina + totalSpeed;
//        return sum;
//    }

//        public default void setCharacters(? t) {
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        while (a + b + c != 9) {
//            Random r = new Random();
//            a = r.nextInt(0, 6);
//            b = r.nextInt(0, 6);
//            c = r.nextInt(0, 6);
//        }
//        this.power = a;
//        stamina = b;
//        speed = c;
//    }