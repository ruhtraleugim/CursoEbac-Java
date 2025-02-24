<<<<<<< HEAD
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
=======
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
>>>>>>> cc41bfd39beddbcf387a11d66ec6ed2e0473dd1f
