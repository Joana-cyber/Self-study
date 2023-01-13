public class ElectricCar extends Car{
    private ElectricMotor electricMotor;

    public ElectricCar(String color, String carPlateNumber, ElectricMotor electricMotor) {
        super(color, carPlateNumber);
        this.electricMotor = electricMotor;
    }

    @Override
    public void chargeCar(){
        this.energy += electricMotor.charge();
    }

    @Override
    public void drive(){
        electricMotor.turnOn();
    }

    @Override
    public void stopCar(){
        electricMotor.turnOff();
    }

    @Override
    public void refill() {
        electricMotor.supplyElectricity();
    }
}
