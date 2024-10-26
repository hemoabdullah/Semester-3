import java.util.List;

public class Employee {
    private String name;
    private int cookingSkill;
    private int servingSkill;
    private int cleaningSkill;

    public Employee(String name, int cookingSkill, int servingSkill, int cleaningSkill) {
        this.name = name;
        this.cookingSkill = cookingSkill;
        this.servingSkill = servingSkill;
        this.cleaningSkill = cleaningSkill;
    }

    public String getName() {
        return name;
    }

    // Method for cooking a dish
    public void cook(Food food) {
        if (food.getStock() > 0) {
            System.out.println(name + " is cooking " + food.getName() + " (" + food.getPreparationTime() + " seconds)");
            try {
                Thread.sleep(food.getPreparationTime() * 1000); // Simulate preparation time
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted while cooking.");
            }
            food.reduceStock(1); // Reduce stock after cooking
            System.out.println(food.getName() + " has been cooked. Remaining stock: " + food.getStock());
        } else {
            System.out.println(food.getName() + " is out of stock!");
        }
    }

    // Method to check if the employee can serve
    public boolean canServe() {
        return servingSkill > 0;
    }

    // Method to serve a customer
    public void serve(Customer customer) {
        if (canServe()) {
            System.out.println(name + " is serving " + customer.getName());
        } else {
            System.out.println(name + " cannot serve right now.");
        }
    }

    // Method to clean up after a customer leaves
    public void cleanTable(Customer customer) {
        System.out.println(name + " cleaned the table after " + customer.getName());
    }
}
