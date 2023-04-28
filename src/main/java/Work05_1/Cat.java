package Work05_1;

import java.util.Random;

public class Cat implements Running {
    // Имя кота
    String name ;
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

    public Cat(String name, double boost, boolean equipment) {
        this.name = name;
        this.boost = boost;
        this.equipment = equipment;
        // Установка случайных значений характеристик бегуна
        double a = 0;
        double b = 0;
        double c = 0;
        while (a + b + c != 108) {
            Random r = new Random();
            a = (r.nextInt(280, 450)) / 10;
            b = (r.nextInt(280, 450)) / 10;
            c = (r.nextInt(280, 450)) / 10;
        }
        power = a;
        stamina = b;
        speed = c;
    }

    public Cat(String name, double power, double stamina, double speed, double boost, boolean equipment) {
        this.name = name;
        this.power = power;
        this.stamina = stamina;
        this.speed = speed;
        this.boost = boost;
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return
                name +
                ",\tpower = " + power +
                ",\tstamina=" + stamina +
                ",\tspeed=" + speed +
                ",\tboost=" + boost +
                ",\tequipment=" + equipment;
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
