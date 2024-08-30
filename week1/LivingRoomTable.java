package week1;

public class LivingRoomTable extends Furniture {  // LivingRoomTable class inherits from Furniture class
    private double length;  
    private double width;  

    public void setDimensions(double length, double width) {  
        this.length = length;
        this.width = width;
    }

    public void showTableInfo() {  // Method to display table information
        showFurnitureInfo();  
        System.out.println("Table Dimensions: " + length + " x " + width + " meters");
    }
}

