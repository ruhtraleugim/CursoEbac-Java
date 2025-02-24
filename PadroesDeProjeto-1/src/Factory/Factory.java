package Factory;

import car.Car;

public abstract class Factory {
    public Car Create(String requestGrade){
        Car car = retriveCar(requestGrade);
        car = prepreteCar(car);
        return car;
    }

    private Car prepreteCar(Car car) {
        Car.cleam();
        Car.mechCheck();
        Car.FuelCar();
        return car;
    }

    abstract Car retriveCar(String requestGrade);

}
