package com.model;

import java.util.Scanner;

public class Car {
    String color;
    String make;
    String model;

    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public Car(){
        this.color = "";
        this.make = "";
        this.model = "";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void display(){
        System.out.println("Color: " + color);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }

    public void inputData(){
        System.out.println("Enter color:");
        Scanner sc = new Scanner(System.in);
        this.color = sc.nextLine();
        System.out.println("Enter make:");
        this.make = sc.nextLine();
        System.out.println("Enter model:");
        this.model = sc.nextLine();
    }
}