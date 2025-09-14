import java.util.*;


    // Creating a class named car with attributes brand, model, price.
    class Car{
        String brand;
        String model;
        int price;

         //Creating a method to display car details
    void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);

    }
}


public class classes {
    public static void main(String args[]){
        //Creating sn object of the Car class
       Car myCar = new Car();

       //Assigning values to attributes
       myCar.brand = "Bugatti";
       myCar.model = "Bugatti_Chirron";
       myCar.price = 1000000;

       //Calling the method to display details
       myCar.displayDetails();
    }
   
}
