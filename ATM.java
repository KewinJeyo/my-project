import java.util.Scanner;

/**
 * PROJECT NAME: Simple ATM Simulator
 * DESCRIPTION: A basic Java program simulating a bank teller machine.
 * This demonstrates classes, switch statements, and user input.
 */

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double balance = 1000.00; // Starting balance
        
        System.out.println("--- 🏦 WELCOME TO JAVA BANK ---");
        
        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = reader.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = reader.nextDouble();
                    balance += deposit;
                    System.out.println("Success! New Balance: $" + balance);
                    break;
                case 3:
                    System.out.println("Thank you for using Java Bank. Goodbye!");
                    reader.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
