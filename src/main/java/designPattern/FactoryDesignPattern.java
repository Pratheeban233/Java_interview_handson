package designPattern;

public class FactoryDesignPattern {

    public static void main(String[] args) {
        Car car = CarFactory.getCar("bmw");
        car.produce();
    }
}

interface Car {
    void produce();
}

class Bmw implements Car{

    @Override
    public void produce() {
        System.out.println("BMW car produced");
    }
}

class Audi implements Car{

    @Override
    public void produce() {
        System.out.println("Audi car produced");
    }
}

class CarFactory {

    public static Car getCar(String type) {
        if(type.equalsIgnoreCase("BMW")) {
            return new Bmw();
        } else if (type.equalsIgnoreCase("Audi")) {
            return new Audi();
        }
        return null;
    }
}