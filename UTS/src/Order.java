public class Order {
    private Customer customer;
    private double amountDue;
    private String paymentMethod;

    public Order(Customer customer, double amountDue, String paymentMethod) {
        this.customer = customer;
        this.amountDue = amountDue;
        this.paymentMethod = paymentMethod;
    }

    public void display() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Amount Due: $" + amountDue);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("------------------------");
    }

    @Override
    public String toString() {
        return "Order from " + customer.getName() + " for $" + amountDue + " paid by " + paymentMethod;
    }
}
