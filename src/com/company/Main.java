package com.company;

public class Main {


    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        BMW bmw = new BMW();
        Garage<Car> garage1 = new Garage<>(toyota);
        Garage<Car> garage2 = new Garage<>(bmw);
        System.out.println("----------------------------------");
        System.out.println( "    Car in Garage is: "+garage1.typeOfCarInGarage().getClass().getSimpleName());
        System.out.println( "    Car in Garage is: "+garage2.typeOfCarInGarage().getClass().getSimpleName());
        System.out.println("----------------------------------");

    }
}