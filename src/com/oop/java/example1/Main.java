package com.oop.java.example1;

import java.awt.Color;
import com.oop.java.example1.model.Car;
import com.oop.java.example1.model.Truck;
import com.oop.java.example1.production.CarProduction;
import com.oop.java.example1.production.TruckProduction;

public class Main {
  public static void main(String[] args) {
    IFactory<Car> carProduction = new CarProduction();
    IFactory<Truck> truckProduction = new TruckProduction();

    System.out.println("--------- CAR ----------");

    Car newCar = carProduction.product("Porsche", Color.RED, IFactory.LUX_CAR_PRICE);
    System.out.println(newCar.toString());

    System.out.println("-------------------");

    Car customerRequest = new Car();
    customerRequest.setBrand("Audi");
    customerRequest.setBroken(false);
    customerRequest.setColor(Color.PINK);
    customerRequest.setPrice(IFactory.MID_CAR_PRICE);
    customerRequest.setSeatCapacity(2);
    customerRequest.setSportCar(true);

    int productNo = carProduction.setVehicle(customerRequest);
    System.out.println("Does car have a problem? " + carProduction.isVehicleBroken(productNo));

    System.out.println("-------- TRUCK -----------");

    Truck newTruck = truckProduction.product("Ford", Color.GRAY, IFactory.MID_TRUCK_PRICE);
    System.out.println(newTruck.toString());

    System.out.println("-------------------");
    System.out.println(truckProduction.getVehicle(newTruck.getProductNumber()).toString());

    System.out.println("Removing: " + truckProduction.removeVehicle(newTruck.getProductNumber()));

    System.out.println("-------------------");
    System.out.println("Size of truck list: " + truckProduction.getAllVehicles().size());
    System.out.println("Size of car list: " + carProduction.getAllVehicles().size());
  }
}
