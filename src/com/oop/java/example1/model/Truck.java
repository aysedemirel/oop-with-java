package com.oop.java.example1.model;

/**
 * Truck object (Common properties are in Vehicle class)
 * 
 * @author aysedemirel
 */
public class Truck extends Vehicle {

  private int cargoSpace;
  private boolean isOffRoading;

  public int getCargoSpace() {
    return cargoSpace;
  }

  public void setCargoSpace(int cargoSpace) {
    this.cargoSpace = cargoSpace;
  }

  public boolean isOffRoading() {
    return isOffRoading;
  }

  public void setOffRoading(boolean isOffRoading) {
    this.isOffRoading = isOffRoading;
  }

  public String toString() {
    String property = String.format(
        "Truck:\n" + "Product Number:%d, Brand: %s, Color: %s, Price: %d\n"
            + "Cargo Space: %d, Off Roading: %b",
        getProductNumber(), getBrand(), getColor().toString(), getPrice(), getCargoSpace(),
        isOffRoading());
    return property;
  }

}
