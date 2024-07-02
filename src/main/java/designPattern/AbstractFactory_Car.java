package designPattern;

public class AbstractFactory_Car {

    public static void main(String[] args) {

        FactoryObject carFactory = CarProducerFactory.getCar("SUV");
        CarObj subSUV = carFactory.carType("subSUV");
        subSUV.produce();

    }
}

class CarProducerFactory {
    public static FactoryObject getCar(String model) {
        if (model.equalsIgnoreCase("SUV")) {
            return new SUVCarFactoryObject();
        } else if (model.equalsIgnoreCase("ordinary")) {
            return new OrdinaryCarFactoryObject();
        }
        return null;
    }
}

class SUVCarFactoryObject extends FactoryObject {

    @Override
    CarObj carType(String type) {
        return switch (type) {
            case "SUV" -> new SUV();
            case "SUBSUV" -> new SubSUV();
            default -> null;
        };
    }
}

class OrdinaryCarFactoryObject extends FactoryObject {

    @Override
    CarObj carType(String type) {
        return switch (type) {
            case "SEDAN" -> new Sedan();
            case "HATCHBACK " -> new Hatchback();
            default -> null;
        };
    }
}


abstract class FactoryObject {
    abstract CarObj carType(String type);
}


class SUV implements CarObj {
    @Override
    public void produce() {
        System.out.println("SUV Car Produced !!!");
    }
}

class SubSUV implements CarObj {
    @Override
    public void produce() {
        System.out.println("Sub-SUV Car Produced !!!");
    }
}

class Sedan implements CarObj {
    @Override
    public void produce() {
        System.out.println("Sedan Car Produced !!!");
    }
}

class Hatchback implements CarObj {
    @Override
    public void produce() {
        System.out.println("Hatchback Car Produced !!!");
    }
}

interface CarObj {
    void produce();
}