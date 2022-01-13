package car;

public class Car {

    String color = "Red";
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
Car car1 = new Car();
Car car2 = car1; // вторая переменная с адресом car1 и ссылается на один обьект.
        System.out.println(car2.engine);
        // car2 не может ссылаться еще на один обьект.
    }
}
