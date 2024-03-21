package car;

public abstract class Car {


    private int horsePower;
    private String CarColor;
    private String tankFuelSource;

    public Car(int horsePower, String carColor, String tankFuelSource) {
        this.horsePower = horsePower;
        CarColor = carColor;
        this.tankFuelSource = tankFuelSource;
    }

    

    public static void FuelCar() {
        System.out.println("carro abastecido");
    }

    public static void mechCheck() {
        System.out.println("carro seguro");
    }

    public static void cleam() {
        System.out.println("carro limpinho e xerozu ");
    }
}
