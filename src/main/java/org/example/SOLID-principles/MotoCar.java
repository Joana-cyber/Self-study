public class MotoCar extends Car{
    private Engine engine;

    public MotoCar(String color, String carPlateNumber, Engine engine) {
        super(color, carPlateNumber);
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.turnOn();
    }

    @Override
    public void stopCar() {
        engine.turnOff();
    }

    @Override
    public void refill() {
        engine.addFuel();
    }

    @Override
    public void chargeCar() {
       energy += engine.charge();
    }
}
