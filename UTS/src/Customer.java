import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Customer {
    private String name;
    private List<Food> preferences;
    private double totalAmountDue;
    private boolean paid;
    private String serviceTime; // String to store formatted time

    public Customer(String name, List<Food> preferences) {
        this.name = name;
        this.preferences = preferences;
        this.totalAmountDue = calculateTotalAmountDue();
        this.paid = false;
        this.serviceTime = ""; // Initialize as empty
    }

    // Method to calculate total amount due based on preferences
    private double calculateTotalAmountDue() {
        double total = 0;
        for (Food food : preferences) {
            total += food.getPrice();
        }
        return total;
    }

    // New method to set service time when served
    public void setServiceTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.serviceTime = LocalTime.now().format(formatter);
    }

    // Method to mark customer as paid
    public void markAsPaid() {
        this.paid = true;
    }

    // Method to check if customer has paid
    public boolean hasPaid() {
        return paid;
    }

    // Getter for total amount due
    public double getTotalAmountDue() {
        return totalAmountDue;
    }

    // Method to get the service time
    public String getServiceTime() {
        return serviceTime;
    }

    // Optionally, you can implement this if you want arrival time functionality
    public String getArrivalTime() {
        return String.valueOf(System.currentTimeMillis() / 1000); // Simulate arrival time as timestamp in seconds
    }

    // Getter for customer name
    public String getName() {
        return name;
    }

    // Getter for customer preferences
    public List<Food> getPreferences() {
        return preferences;
    }
}

