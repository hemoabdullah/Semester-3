import java.util.Scanner;

public class Rental {
    public String id;           
    public String memberName;
    public String gameName;
    public int rentalDuration; // in days
    public double pricePerDay;

    public void selectGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n choose a game To borrow:");
        System.out.println("1. FIFA");
        System.out.println("2. Call of Duty (COD)");
        System.out.println("3. WWE");
        System.out.println("4. PES");
        System.out.println("5. GTA");

        System.out.print("\nEnter the The game Number: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                gameName = "FIFA";
                pricePerDay = 30000; // 
            case 2:
                gameName = "Call of Duty";
                pricePerDay = 40000; 
                break;
            case 3:
                gameName = "WWE";
                pricePerDay = 25000; 
                break;
            case 4:
                gameName = "PES";
                pricePerDay = 20000;
                break;
            case 5:
                gameName = "GTA";
                pricePerDay = 50000; 
                break;
            default:
                System.out.println("Invalid , Please try again.");
                selectGame(); 
        }
    }

    public double calculateTotal() {
        return pricePerDay * rentalDuration;
    }

    public void displayRentalInfo() {
        System.out.println("\n--- Your Order info ---");
        System.out.println("Member Name: " + memberName);
        System.out.println("Game Name: " + gameName);
        System.out.println("Rental Duration (days): " + rentalDuration);
        System.out.println("Price per Day: " + pricePerDay);
        System.out.println("Total Amount to Pay: " + calculateTotal());
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rental rental1 = new Rental();


        System.out.print("Enter Your Name: ");
        rental1.memberName = scanner.nextLine();

        System.out.print("Enter Rental Duration (days): ");
        rental1.rentalDuration = scanner.nextInt();


        rental1.selectGame();

        rental1.displayRentalInfo();

        scanner.close();
    }
}
