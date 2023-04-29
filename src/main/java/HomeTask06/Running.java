package HomeTask06;

import HomeTask06.Interfaces.PointSum;
import HomeTask06.Interfaces.PrintResult;
import HomeTask06.Interfaces.WhoWinner;
import HomeTask06.Interfaces.WinChance;

import java.util.Random;

public class Running implements PointSum, PrintResult, WhoWinner {
    // Разновидность забега: Городской забег (mod=1), Марафон (mod=2), Спринт (mod=3)
    int discipline;
    // Коэффициент усиления
    double coef;
    // Награда
    double prize;

    public Running(int discipline, double coef, double prize) {
        this.discipline = discipline;
        this.coef = coef;
        this.prize = prize;
    }

    @Override
    public double[] pointSum(Cat cat) {
        if (cat.equipmentAvailability()) {
            // 1. Очки при использовании экипировки
            Equipment equip = new Equipment(3);
            double[] stats = {cat.power + equip.power, cat.stamina + equip.stamina, cat.speed + equip.speed};
            stats[discipline-1] = stats[discipline-1] * coef;
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
        } else {
            // 2. Очки без использования экипировки
            double[] stats = {cat.power, cat.stamina, cat.speed};
            stats[discipline-1] = stats[discipline-1] * coef;
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

    @Override
    public void printResult(Cat cat1, Cat cat2, double[] resStats1, double[] resStats2) {
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
                PrintResult.sumListElements(resStats1), PrintResult.sumListElements(resStats2));
    }

    @Override
    public int whoWinner(Cat cat1, Cat cat2) {
        double[] resultStats1 = pointSum(cat1);
        double[] resultStats2 = pointSum(cat2);
        // Печать результатов забега
        printResult(cat1, cat2, resultStats1, resultStats2);
        if (PrintResult.sumListElements(resultStats1) > PrintResult.sumListElements(resultStats2)) {
            System.out.println("Победитель -> " + cat1.getName());
            return 1;
        } else if ((PrintResult.sumListElements(resultStats1) < PrintResult.sumListElements(resultStats2))) {
            System.out.println("Победитель -> " + cat2.getName());
            return 2;
        } else {
            System.out.println("Ничья");
            return 0;
        }
    }


}
