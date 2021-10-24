package com.oop.java.example1;

import java.awt.Color;
import java.util.HashMap;

public interface IFactory<T> {
  public static final int LUX_TRUCK_PRICE = 100000;
  public static final int MID_TRUCK_PRICE = 50000;
  public static final int CHEAP_TRUCK_PRICE = 10000;

  public static final int LUX_CAR_PRICE = 10000;
  public static final int MID_CAR_PRICE = 5000;
  public static final int CHEAP_CAR_PRICE = 1000;

  public T getVehicle(int productNumber);

  public int setVehicle(T vehicle);

  public boolean isVehicleBroken(int productNumber);

  public boolean removeVehicle(int vehicle);

  public HashMap<Integer, T> getAllVehicles();

  public T product(String brand, Color color, int price);
}
