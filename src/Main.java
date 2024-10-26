import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Hammam Diner");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n🌟=== Welcome to the Restaurant Simulation Game ===🌟");
            System.out.println("🍽️ 1. 🍴 Open Restaurant Gates");
            System.out.println("📦 2. 📋 View Stock");
            System.out.println("🍞 3. 🍕 Restock Food");
            System.out.println("💰 4. 🧾 Finances");
            System.out.println("🧾 5. 📄 Display Transaction History");
            System.out.println("🔒 6. ☕ Close for Break Time");
            System.out.println("⭐ 7. 📊 Measure Customer Satisfaction");
            System.out.println("❌ 8. 🚪 Exit");
            System.out.println("\n🔹 Choose an option by entering the number:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    restaurant.openRestaurant();
                    break;
                case 2:
                    restaurant.viewStock();
                    break;
                case 3:
                    System.out.print("Enter food name to restock: ");
                    String foodName = scanner.next();
                    System.out.print("Enter amount to restock: ");
                    int amount = scanner.nextInt();
                    restaurant.restockFood(foodName, amount);
                    break;
                case 4:
                    restaurant.viewFinances();
                    break;
                case 5:
                    restaurant.viewTransactionHistory();
                    break;
                case 6:
                    restaurant.closeRestaurant();
                    break;
                case 7:
                    restaurant.measureCustomerSatisfaction();
                    break;
                case 8:
                    running = false;
                    System.out.println("Exiting the restaurant management system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
