package week1;

public class Furniture {
    private String material;  
    private String color; 

    public void setMaterial(String material) {  
        this.material = material;
    }

    public void setColor(String color) {  
        this.color = color;
    }

    public void showFurnitureInfo() {  // Method to display furniture information
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
    }
}
