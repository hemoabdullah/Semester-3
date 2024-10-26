import java.util.List;

public class Food {
    private String name;
    private double price;
    private int stock;
    private List<ingredient> ingredients;
    private int preparationTime;  // in seconds

    public Food(String name, double price, int stock, List<ingredient> ingredients, int preparationTime) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.ingredients = ingredients;
        this.preparationTime = preparationTime;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public List<ingredient> getIngredients() {
        return ingredients;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void reduceStock(int amount) {
        stock -= amount;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ") - Stock: " + stock + " | Prep time: " + preparationTime + " seconds";
    }
}
