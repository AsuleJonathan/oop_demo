package com.oop.demo.polymorphism;

public class PassengerPlane extends Aeroplane{
    public void fly() // Overriding Method
    {
        System.out.println("PassengerPlane is flying");
    }
    public void carryPassenger() // Specialized Method
    {
        System.out.println("PassengerPlane carries passenger");
    }
    public void takeOff()
    {
        System.out.println("PassengerPlane is taking off");
    }

}
