package week3;
import java.util.Scanner;
public class AnggotaTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Anggota Donny = new Anggota("111333444","Donny",5000000);

        boolean menu = true;
        while (menu) {
            System.out.println("    Member name : " +Donny.getName()+"     ");
            
            System.out.println("\n          MENU         ");
            System.out.println("    1.  Borrow money");
            System.out.println("    2.  Pay installments");
            System.out.println("    3.  Check loan amount");
            System.out.println("    4.  Exit");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to borrow: ");
                    int borrowAmount = scan.nextInt();
                    Donny.borrow(borrowAmount);
                    System.out.println("Current loan amount: " + Donny.getLoanAmount());
                    break;

                case 2:
                    System.out.print("Enter the installment amount to pay: ");
                    int installmentAmount = scan.nextInt();
                    Donny.installments(installmentAmount);
                    System.out.println("Current loan amount: " + Donny.getLoanAmount());

                    break;

                case 3:
                    System.out.println("Current loan amount: " + Donny.getLoanAmount());

                    break;

                case 4:
                    menu = false;
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");

                    break;
            }
        }
       
}
}