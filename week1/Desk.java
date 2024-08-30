package week1;

public class Desk extends Furniture {  
    private int numberOfDrawers;  

    public void setNumberOfDrawers(int numberOfDrawers) {  
        this.numberOfDrawers = numberOfDrawers;
    }

    public void showDeskInfo() {  
        showFurnitureInfo();  // Call the parent class 
        System.out.println("Number of Drawers: " + numberOfDrawers);
    }
}
