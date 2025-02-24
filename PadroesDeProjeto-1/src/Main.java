//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Factory.CarFactory;
import Factory.CompanyCarFactory;
import Factory.Factory;
import car.Car;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("A", true);
        Factory Factory = getFactory(cliente1);
        Car car = Factory.Create(cliente1.getRequestGrade());
    }


    private static Factory getFactory(Cliente cliente1){
            if(cliente1.haveCompanyCarContract()){
                return new CompanyCarFactory();
            } else {
                return new CarFactory();}
        }
    }
