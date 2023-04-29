package HomeTask06;

import HomeTask06.Interfaces.SetCharacteristics;
import HomeTask06.Interfaces.WinChance;

import java.util.Random;

public class Cat implements SetCharacteristics, WinChance {
    // Имя кота
    String name;
    // Сила кота
    double power;
    // Выносливость кота
    double stamina;
    // Скорость кота
    double speed;
    // Модификатор одной из характеристик
    double boost;
    // Наличие экипировки
    boolean equipment;
    // Уровень
    int level;



    public Cat(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Cat(String name, double power, double stamina, double speed, double boost, boolean equipment, int level) {
        this.name = name;
        this.power = power;
        this.stamina = stamina;
        this.speed = speed;
        this.boost = boost;
        this.equipment = equipment;
        this.level = level;
    }

    @Override
    public String toString() {
        return
                this.name +
                        ",\tpower = " + this.power +
                        ",\tstamina = " + this.stamina +
                        ",\tspeed = " + this.speed +
                        ",\tboost = " + this.boost +
                        ",\tequipment = " + this.equipment +
                        ",\tlevel = " + this.level;
    }

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    public double getStamina() {
        return stamina;
    }

    public double getSpeed() {
        return speed;
    }

    public double getBoost() {
        return boost;
    }

    public boolean equipmentAvailability() {
        return equipment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setBoost(double boost) {
        this.boost = boost;
    }

    public void setEquipmentAvailability(boolean equipment) {
        this.equipment = equipment;
    }

    @Override
    public void setCharacteristics(int level) {
        double a = 0;
        double b = 0;
        double c = 0;
        boolean d = false;
        double e = 0;
        Random eq = new Random();
        d = eq.nextBoolean();
        Random bo = new Random();
        e = ((bo.nextInt(0, 5) * 5.0) / 100.0) + 1;
        switch (level) {
            case 6 -> {
                Random t = new Random();
                int x = t.nextInt(103, 114);
                while (a + b + c != x) {
                    Random r = new Random();
                    a = (r.nextInt(186, 552)) / 10.0;
                    b = (r.nextInt(186, 552)) / 10.0;
                    c = (r.nextInt(186, 552)) / 10.0;
                }
            }
            case 8 -> {
                Random t = new Random();
                int x = t.nextInt(144, 184);    //144 144 148-152 152-156-164-172
                while (a + b + c != x) {
                    Random r = new Random();
                    a = (r.nextInt(136, 1480)) / 10.0;
                    b = (r.nextInt(136, 1480)) / 10.0;
                    c = (r.nextInt(136, 1480)) / 10.0;
                }
            }
            case 10 -> {
                Random t = new Random();
                int x = t.nextInt(210, 230);
                while (a + b + c != x) {
                    Random r = new Random();
                    a = (r.nextInt(220, 1730)) / 10.0;
                    b = (r.nextInt(220, 1730)) / 10.0;
                    c = (r.nextInt(220, 1730)) / 10.0;
                }
            }
        }
        this.power = a;
        stamina = b;
        speed = c;
        equipment = d;
        boost = e;
    }

    public static Cat randomCat(String name, int level) {
        Cat randomCat = new Cat(name, level);
        randomCat.setCharacteristics(level);
        randomCat.name = name;
        randomCat.level = level;
        return randomCat;
    }

    @Override
    public double winChance(Running run, double runNumber, String catName, int catLevel) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < runNumber; i++) {
            int temp = run.whoWinner(this, Cat.randomCat(catName, catLevel));
            if (temp == 1) {
                count1 += 1;
            } else {
                count2 += 1;
            }
        }
        return ((runNumber - count2) / runNumber) * 100;
    }
}
