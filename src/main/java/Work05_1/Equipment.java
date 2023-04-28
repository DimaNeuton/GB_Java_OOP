package Work05_1;

import java.util.Random;

// Экипировка бегуна
public class Equipment {
    // добавляемая сила
    int power;
    // добавляемая выносливость
    int stamina;
    // добавляемая скорость
    int speed;
    // показатель редкости экипировки
    // 1 - обычный (6 единиц)
    // 2 - необычный (7 единиц)
    // 3 - редкий (10 единиц)
    // 4 - эпический (16 единиц)
    // 5 - легендарный (22 единицы)
    int rarity;

    public Equipment(int rarity) {
        this.rarity = rarity;
        int maxEquipPoint = 0;
        int totalEquipPoint = 0;
        switch (rarity) {
            case 1 -> {maxEquipPoint = 3; totalEquipPoint = 6; break;}
            case 2 -> {maxEquipPoint = 4; totalEquipPoint = 7; break;}
            case 3 -> {maxEquipPoint = 6; totalEquipPoint = 10; break;}
            case 4 -> {maxEquipPoint = 9; totalEquipPoint = 16; break;}
            case 5 -> {maxEquipPoint = 13; totalEquipPoint = 22; break;}
            default -> System.out.println("Такой редкости не существует");
        }
        // Установка случайных значений характеристик экипировки
        int a = 0;
        int b = 0;
        int c = 0;
        while (a + b + c != totalEquipPoint) {
            Random r = new Random();
            a = r.nextInt(0, maxEquipPoint);
            b = r.nextInt(0, maxEquipPoint);
            c = r.nextInt(0, maxEquipPoint);
        }
        power = a;
        stamina = b;
        speed = c;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "power=" + power +
                ", stamina=" + stamina +
                ", speed=" + speed +
                '}';
    }

//    public void setCharacters() {
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        while (a + b + c != 9) {
//            Random r = new Random();
//            a = r.nextInt(0, 6);
//            b = r.nextInt(0, 6);
//            c = r.nextInt(0, 6);
//        }
//        power = a;
//        stamina = b;
//        speed = c;
//    }
}