package com.oop.demo.polymorphism;

public class CargoPlane  extends Aeroplane{
    public void fly()
    {
        System.out.println("CargoPlane is flying");
    }
    public void carryGoods() // Specialized Method
    {
        System.out.println("CargoPlane carries goods");
    }
    public void takeOff()
    {
        System.out.println("CargoPlane is taking off");
    }
}
