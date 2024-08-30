package week1;

public class car {
     //the car Attribute 
    private String make; 
    private String model;  
    private int year;  

    public void setMake(String newMake) { 
        this.make = newMake;
    }

    public void setModel(String newModel) { 
        this.model = newModel;
    }

    public void setYear(int newYear) {  
        this.year = newYear;
    }

    public void startEngine() {  // Method to start the engine of the car
        System.out.println("Engine of " + make + " " + model + " is starting.");
    }

    public void stopEngine() {  // Method to stop the engine of the car
        System.out.println("Engine of " + make + " " + model + " is stopping.");
    }

    public void showCarInfo() {  // Method to display car information
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
