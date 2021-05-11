package com.oop.java.example2.inclass;

class Test {
  interface Yes {
    void show();
  }
}


class NestedInterfaceInClass {
  public static void main(String[] args) {
    Test.Yes obj;
    TestingInterface t = new TestingInterface();
    obj = t;
    obj.show();
  }
}
