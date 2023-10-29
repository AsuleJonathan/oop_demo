package com.oop.demo.polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Aeroplane cp = new CargoPlane(); // object reference type must be same as its class or Parent class .

      PassengerPlane pp = new PassengerPlane();

      Aeroplane ref ;

   // cp = pp ;  cp won't be able to hold the address of pp.
      ref = cp ; // but parent class reference has capacity to hold child class address .

      /*
       * Polymorphism ("Method override")
       */
      ref.fly();
      ref.takeOff();
      System.out.println("--------------------------");
      ref = pp ;
      ref.takeOff();
      ref.fly();
  }
}
