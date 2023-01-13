public class DCMotor implements ElectricMotor{
    private Double powerSupply;

    public DCMotor(Double powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public Double supplyElectricity() {
        return powerSupply;
    }

    @Override
    public Double charge() {
        return null;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
