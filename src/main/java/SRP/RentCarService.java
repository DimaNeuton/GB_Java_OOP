package SRP;

public class RentCarService {
        public Order orderCar(String carNo, Client client) {
        // client order car
        Order order = new Order();
        return order;
    }

    private Pay pay;

    public RentCarService(Pay pay) {
        this.pay = pay;
    }
}




