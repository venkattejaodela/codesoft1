import java.util.Scanner;

public class Atm {

    static double balance = 5000.00;

    public static double check() {
        return balance;
    }

    public static void dep(double rupees) {
        if (rupees > 0) {
            balance += rupees;
            System.out.println("Deposit successful.\nYour new balance is: Rs " + balance);
        } else {
            System.out.println("Invalid rupees.\nPlease enter correct amount.");
        }
    }

    public static void wd(double rupees) {
        if (rupees > 0 && rupees <= balance) {
            balance -= rupees;
            System.out.println("Withdrawal successful.\nYour new balance is: Rs " + balance);
        } else if (rupees > balance) {
            System.out.println("Withdrawal failed.\nInsufficient amount.");
        } else {
            System.out.println("Invalid rupees.\nPlease enter correct amount.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keep = true;

        while (keep) {
            System.out.println("\n-----------------------------");
            System.out.println("Atm Menu:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("choose an option from 1-4: ");

            int change = sc.nextInt();
            double rupees;

            switch (change) {
                case 1:
                    System.out.println("Your current balance is: Rs " + check());
                    break;

                case 2:
                    System.out.print("Enter rupees to dep: Rs ");
                    rupees = sc.nextDouble();
                    dep(rupees);
                    break;

                case 3:
                    System.out.print("Enter rupees to wd: Rs ");
                    rupees = sc.nextDouble();
                    wd(rupees);
                    break;

                case 4:
                    keep = false;
                    System.out.println("Thank you for using the Atm. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose from 1-4.");
            }
        }

        sc.close();
    }
}
