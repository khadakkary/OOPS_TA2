interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class Que4 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}
