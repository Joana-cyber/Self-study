public abstract class Car implements Drivable{
    protected String color;

    protected String carPlateNumber;

    protected Double energy;

    public Car(String color, String carPlateNumber) {
        this.color = color;
        this.carPlateNumber = carPlateNumber;
        this.energy = 0.0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarPlateNumber() {
        return carPlateNumber;
    }

    public void setCarPlateNumber(String carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    public abstract void drive();

    public abstract void stopCar();

    public abstract void refill();

    public abstract void chargeCar();
}
