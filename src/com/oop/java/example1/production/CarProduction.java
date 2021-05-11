package com.oop.java.example1.production;

import java.awt.Color;
import java.util.HashMap;
import com.oop.java.example1.IFabric;
import com.oop.java.example1.model.Car;

/**
 * It is line of car production.
 * 
 * @author aysedemirel
 */
public class CarProduction implements IFabric<Car> {

  private HashMap<Integer, Car> carList;
  private int lastProductNo = 1;

  public CarProduction() {
    carList = new HashMap<>();
  }

  @Override
  public Car getVehicle(int productNumber) {
    return carList.get(productNumber);
  }

  @Override
  public int setVehicle(Car vehicle) {
    vehicle.setProductNumber(lastProductNo);
    carList.put(lastProductNo++, vehicle);
    return vehicle.getProductNumber();
  }

  @Override
  public boolean isVehicleBroken(int productNumber) {
    return carList.get(productNumber).isBroken();
  }

  @Override
  public boolean removeVehicle(int vehicle) {
    Car c = carList.remove(vehicle);
    return c != null;
  }

  @Override
  public HashMap<Integer, Car> getAllVehicles() {
    return carList;
  }

  @Override
  public Car product(String brand, Color color, int price) {
    Car newCar = new Car();
    newCar.setBrand(brand);
    newCar.setColor(color);
    newCar.setPrice(price);
    newCar.setProductNumber(lastProductNo);
    newCar.setBroken(false);
    setProperty(newCar);
    carList.put(lastProductNo++, newCar);
    return newCar;

  }

  private void setProperty(Car newCar) {
    switch (newCar.getPrice()) {
      case LUX_CAR_PRICE: {
        newCar.setSportCar(true);
        newCar.setSeatCapacity(2);
        break;
      }
      case MID_CAR_PRICE: {
        newCar.setSportCar(false);
        newCar.setSeatCapacity(5);
        break;
      }
      case CHEAP_CAR_PRICE: {
        newCar.setSportCar(false);
        newCar.setSeatCapacity(2);
        break;
      }
      default:
        break;
    }
  }

}
