package week1;

public class Truck extends car {  // Truck class inherits from Car class
    private double loadCapacity;  

    public void setLoadCapacity(double newLoadCapacity) {  
    }

    public void loadCargo() {  
        System.out.println("Loading cargo. Capacity: " + loadCapacity + " tons.");
    }

    public void unloadCargo() {  // Method to unload cargo from the truck
        System.out.println("Unloading cargo.");
    }

    @Override
    public void showCarInfo() {  
        super.showCarInfo(); 
        System.out.println("Load Capacity: " + loadCapacity + " tons.");
    }
}
