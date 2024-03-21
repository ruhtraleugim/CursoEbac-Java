package Factory;

import car.Car;
import car.CarChevrolet;
import car.CarNissan;

public class CompanyCarFactory extends Factory {
    @Override
    Car retriveCar(String requestGrade) {
        if ("A".equals(requestGrade)){
            return new CarChevrolet(400,"Black","fuel-tank");
        }else return new CarNissan(310,"Blue","fuel-tank");
    }
}
