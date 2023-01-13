import java.util.*;

public class Register {
    Map<String, Car> registeredCars = new HashMap<>();

    public void registerCar(Car car){
        registeredCars.put(car.getCarPlateNumber(),car);
    }

    public boolean isRegistered(String plateNumber){
        return registeredCars.containsKey(plateNumber);
    }
}
