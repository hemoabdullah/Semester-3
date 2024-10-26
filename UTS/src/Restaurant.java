import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Restaurant {
    private String name;
    private List<Food> menu = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private Queue<Customer> customerQueue = new LinkedList<>();
    private double finances;
    private int reputation;
    private List<Order> transactionHistory = new ArrayList<>();
    private int totalCustomerSatisfaction = 0;
    private int totalCustomersServed = 0;
    private boolean isOpen;

    // Constructor with name
    public Restaurant(String name) {
        this.name = name;
        this.finances = 1000.00;
        this.reputation = 100;
        this.isOpen = false;
        setupEmployees();
        setupMenu();
    }

    // Method to set up the menu
    public void setupMenu() {
        List<ingredient> burgerIngredients = Arrays.asList(
                new ingredient("Bun", 50),
                new ingredient("Beef Patty", 30),
                new ingredient("Cheese", 40)
        );
        List<ingredient> friesIngredients = Arrays.asList(
                new ingredient("Potatoes", 60),
                new ingredient("Salt", 80)
        );
        List<ingredient> sodaIngredients = Arrays.asList(
                new ingredient("Water", 100),
                new ingredient("Syrup", 50)
        );
        List<ingredient> pizzaIngredients = Arrays.asList(
                new ingredient("Dough", 70),
                new ingredient("Tomato Sauce", 40),
                new ingredient("Cheese", 50)
        );

        menu.add(new Food("Burger", 5.99, 10, burgerIngredients, 20));
        menu.add(new Food("Fries", 2.99, 5, friesIngredients, 30));
        menu.add(new Food("Soda", 1.50, 2, sodaIngredients, 50));
        menu.add(new Food("Pizza", 8.99, 15, pizzaIngredients, 10));
        menu.add(new Food("Pasta", 7.99, 10, Arrays.asList(new ingredient("Noodles", 60), new ingredient("Sauce", 40)), 15));
        menu.add(new Food("Water", 0.99, 50, Arrays.asList(new ingredient("Water", 100)), 100));
        menu.add(new Food("Juice", 2.50, 30, Arrays.asList(new ingredient("Fruit", 60), new ingredient("Water", 20)), 50));
    }

    // Method to set up employees
    public void setupEmployees() {
        employees.add(new Employee("Majid", 7, 8, 6));
        employees.add(new Employee("Chef Bayu", 10, 1, 0));
        employees.add(new Employee("Hammam", 5, 6, 5));
        employees.add(new Employee("Aqila", 0, 0, 8));
    }

    // Method to open restaurant gates
    public void openRestaurant() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("The restaurant is now open for business!");
            startReceivingOrders();
        } else {
            System.out.println("The restaurant is already open.");
        }
    }

    // Method to close restaurant for a break
    public void closeRestaurant() {
        if (isOpen) {
            isOpen = false;
            System.out.println("The restaurant is now closed for a break.");
        } else {
            System.out.println("The restaurant is already closed.");
        }
    }

    // Method to start receiving orders
    private void startReceivingOrders() {
        while (isOpen) {
            generateCustomerAndOrder();
            try {
                Thread.sleep(5000); // Wait 5 seconds for the next customer
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Method to generate customer and process their order
    private void generateCustomerAndOrder() {
        Customer customer = generateRandomCustomer();
        customerQueue.add(customer);
        System.out.println("\nWelcome! " + customer.getName() + " has arrived and ordered:");
        for (Food food : customer.getPreferences()) {
            System.out.println(" - " + food.getName());
        }
        System.out.print("Accept order? (Y/N): ");
        Scanner scanner = new Scanner(System.in);
        String accept = scanner.nextLine().toUpperCase();
        if (accept.equals("Y")) {
            orderFood(customer);
            processPayment(customer);
            totalCustomersServed++;
        } else {
            System.out.println(customer.getName() + " left without placing an order.");
        }
    }

    // Method to process the order for food
    private void orderFood(Customer customer) {
        for (Food food : customer.getPreferences()) {
            if (food.getStock() > 0) {
                food.reduceStock(1);
            } else {
                System.out.println(food.getName() + " is out of stock!");
            }
        }
    }

    // Method to process payment
    private void processPayment(Customer customer) {
        customer.setServiceTime();
        double amountDue = customer.getTotalAmountDue();
        System.out.println(customer.getName() + " needs to pay: $" + amountDue);

        try {
            Thread.sleep(5000); // Delay before payment step
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (amountDue > 0) {
            customer.markAsPaid();
            finances += amountDue;
            String paymentMethod = chooseRandomPaymentMethod();
            System.out.println(customer.getName() + " paid using " + paymentMethod + ".");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Served at: " + customer.getServiceTime() + " by Baihaqi.");
            cleanTableAfterCustomerLeaves(customer);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            updateCustomerSatisfaction(customer);
        }
    }

    // Method to choose a random payment method
    private String chooseRandomPaymentMethod() {
        String[] methods = {"CASH", "QRIS", "CREDIT CARD"};
        Random random = new Random();
        return methods[random.nextInt(methods.length)];
    }

    // Method to clean table after customer leaves
    private void cleanTableAfterCustomerLeaves(Customer customer) {
        Employee aqila = employees.stream()
                .filter(emp -> emp.getName().equals("Aqila"))
                .findFirst()
                .orElse(null);
        if (aqila != null) {
            aqila.cleanTable(customer);
        }
    }

    // Method to generate random customer
    private Customer generateRandomCustomer() {
        Random random = new Random();
        String[] customerNames = {"Agna Putra", "Ahmad Adzin", "Muhammad Tegar", "Golden Christian",
                "Muhammad Faiz", "Ridho Anfa", "Antonius Jew", "Krisna Prawira",
                "Charellino", "Erwan Majid", "Febrian Arka", "Al Baihaqi", "Muhammad Farhan", "Yuma Akhunza",
                "Kevin Bramasta", "Sherly Lutfi", "Fahreiza Taura", "Mikaila Kafka",
                "Baskoro Seno", "Xavier Zaidane"};
        String name = customerNames[random.nextInt(customerNames.length)];
        List<Food> preferences = new ArrayList<>();
        int numPreferences = random.nextInt(2) + 1;
        for (int i = 0; i < numPreferences; i++) {
            Food food = menu.get(random.nextInt(menu.size()));
            if (!preferences.contains(food)) {
                preferences.add(food);
            }
        }
        return new Customer(name, preferences);
    }

    // Method to update customer satisfaction
    private void updateCustomerSatisfaction(Customer customer) {
        Random random = new Random();
        int satisfaction = random.nextInt(10);
        totalCustomerSatisfaction += satisfaction;
        System.out.println(customer.getName() + " satisfaction level: " + satisfaction);
    }

    // Method to view stock of food items
    public void viewStock() {
        System.out.println("Stock available:");
        for (Food food : menu) {
            System.out.println(food.toString());
        }
    }

    // Method to restock food
    public void restockFood(String foodName, int amount) {
        for (Food food : menu) {
            if (food.getName().equals(foodName)) {
                food.reduceStock(-amount);
                System.out.println("Restocked " + foodName + " with " + amount + " units.");
                return;
            }
        }
        System.out.println("Food not found in menu.");
    }

    // Method to view financial summary
    public void viewFinances() {
        System.out.println("Restaurant finances: $" + finances);
    }

    // Method to view transaction history
    public void viewTransactionHistory() {
        System.out.println("Transaction history:");
        for (Order transaction : transactionHistory) {
            System.out.println(transaction.toString());
        }
    }

    // Method to measure customer satisfaction
    public void measureCustomerSatisfaction() {
        int satisfaction = (int) (Math.random() * 100);
        System.out.println("Customer satisfaction level: " + satisfaction + "%");
    }

// Getter for restaurant name
    public String getName() {
        return name;
    }

    // Setter for restaurant name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for restaurant open status
    public boolean isOpen() {
        return isOpen;
    }

    // Setter for restaurant open status
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
