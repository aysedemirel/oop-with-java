package com.oop.java.example2.ininterface;

public class NestedInterface {
  public static void main(String[] args) {
    INestedInterface.Yes obj;
    TestNestedInterface t = new TestNestedInterface();
    obj = t;
    obj.show();
  }
}
