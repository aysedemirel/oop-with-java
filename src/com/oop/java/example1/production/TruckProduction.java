package com.oop.java.example1.production;

import java.awt.Color;
import java.util.HashMap;
import com.oop.java.example1.IFabric;
import com.oop.java.example1.model.Truck;

/**
 * It is line of truck production.
 * 
 * @author aysedemirel
 */
public class TruckProduction implements IFabric<Truck> {
  private HashMap<Integer, Truck> truckList;
  private int lastProductNo = 1;

  public TruckProduction() {
    truckList = new HashMap<>();
  }

  @Override
  public Truck getVehicle(int productNumber) {
    return truckList.get(productNumber);
  }

  @Override
  public int setVehicle(Truck vehicle) {
    vehicle.setProductNumber(lastProductNo);
    truckList.put(lastProductNo++, vehicle);
    return vehicle.getProductNumber();
  }

  @Override
  public boolean isVehicleBroken(int productNumber) {
    return truckList.get(productNumber).isBroken();
  }

  @Override
  public boolean removeVehicle(int vehicle) {
    Truck t = truckList.remove(vehicle);
    return t != null;
  }

  @Override
  public HashMap<Integer, Truck> getAllVehicles() {
    return truckList;
  }

  @Override
  public Truck product(String brand, Color color, int price) {
    Truck newTruck = new Truck();
    newTruck.setBrand(brand);
    newTruck.setColor(color);
    newTruck.setPrice(price);
    newTruck.setProductNumber(lastProductNo);
    newTruck.setBroken(false);
    setProperty(newTruck);
    truckList.put(lastProductNo++, newTruck);
    return newTruck;
  }

  private void setProperty(Truck newTruck) {
    switch (newTruck.getPrice()) {
      case LUX_TRUCK_PRICE: {
        newTruck.setCargoSpace(100);
        newTruck.setOffRoading(true);
        break;
      }
      case MID_TRUCK_PRICE: {
        newTruck.setCargoSpace(60);
        newTruck.setOffRoading(true);
        break;
      }
      case CHEAP_TRUCK_PRICE: {
        newTruck.setCargoSpace(40);
        newTruck.setOffRoading(false);
        break;
      }
      default:
        break;
    }
  }

}
