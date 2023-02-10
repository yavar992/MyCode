package Coding_ninja;


public class Engine {
    private Fuel fuel;

    public Engine(Fuel fuel) {
        this.fuel = fuel;
    }

    public void start() {
        fuel.burn();
    }
}

class Fuel {
    public void burn() {
        // burn the fuel
    }
}

 class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println( "start...");
    }
}

class Main {
    public static void main(String[] args) {
        Fuel fuel = new Fuel();
        Engine engine = new Engine(fuel);
        Car car = new Car(engine);
        car.start();
    }
}