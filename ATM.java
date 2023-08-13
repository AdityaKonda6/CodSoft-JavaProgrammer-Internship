import java.util.Scanner;

public class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void showMenu() {
        System.out.println("CodSoft Task 3:- ATM Interface By Aditya Konda");
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
//Aditya Konda//
    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do {
                showMenu();
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your Balance: $" + bankAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: $");
                        double depositAmount = scanner.nextDouble();
                        bankAccount.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: $");
                        double withdrawalAmount = scanner.nextDouble();
                        bankAccount.withdraw(withdrawalAmount);
                        break;
                    case 4:
                        System.out.println("Exiting the ATM. Have a nice day!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } while (choice != 4);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance
        ATM atm = new ATM(account);
        atm.run();
    }
}
