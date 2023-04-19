package Work2_6;

public class Sedan extends Car{

    @Override
    public void Brake() {

    }
}

class Main {
    public static void main(String[] args) {
        Sedan car = new Sedan();
        car.Gas();
    }
}
