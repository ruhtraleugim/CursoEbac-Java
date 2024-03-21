package Factory;

import car.Car;
import car.CarHonda;

public class CarFactory extends Factory {
    @Override
    Car retriveCar(String requestGrade) {
        if ("A".equals(requestGrade)) {
            return new CarHonda(100, "white", "half-tank");
        }else return null;
    }
}
