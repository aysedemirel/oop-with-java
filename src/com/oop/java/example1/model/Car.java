package com.oop.java.example1.model;

/**
 * Car object (Common properties are in Vehicle class)
 * 
 * @author aysedemirel
 */
public class Car extends Vehicle {

  private int seatCapacity;
  private boolean isSportCar;

  public int getSeatCapacity() {
    return seatCapacity;
  }

  public void setSeatCapacity(int seatCapacity) {
    this.seatCapacity = seatCapacity;
  }

  public boolean isSportCar() {
    return isSportCar;
  }

  public void setSportCar(boolean isSportCar) {
    this.isSportCar = isSportCar;
  }

  public String toString() {
    String property = String.format(
        "Car:\n" + "Product Number:%d, Brand: %s, Color: %s, Price: %d\n"
            + "Seat capacity: %d, Sport Car: %b",
        getProductNumber(), getBrand(), getColor().toString(), getPrice(), getSeatCapacity(),
        isSportCar());
    return property;
  }
}
