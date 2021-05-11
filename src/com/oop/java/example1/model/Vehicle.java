package com.oop.java.example1.model;

import java.awt.Color;

/**
 * Vehicle class is to collect common properties.
 * 
 * @author aysedemirel
 */
public class Vehicle {

  private int productNumber;
  private String brand;
  private int price;
  private Color color;
  private boolean isBroken;


  public int getProductNumber() {
    return productNumber;
  }

  public void setProductNumber(int productNumber) {
    this.productNumber = productNumber;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public boolean isBroken() {
    return isBroken;
  }

  public void setBroken(boolean isBroken) {
    this.isBroken = isBroken;
  }
}
