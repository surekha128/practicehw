package MethodOverriding;
/*
23. Example of method overriding
//Java Program to illustrate the use of Java Method Overriding
//Creating a parent class.

 */
 class Vehicle {
     //defining a method
    public void run()
    {
        System.out.println("Vehicle is running");
    }
}
//Creating a child class
class Bike2 extends Vehicle{
     //defining the same method as in the parent class
    public void run()
    {
        System.out.println("Bike is running safely");
    }


    public static void main(String[] args) {
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
 }