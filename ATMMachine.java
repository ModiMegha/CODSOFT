import java.util.Scanner;

class ATM {
    float balance;
    int PIN;

    public void setPIN(int pin) { 
        PIN = pin;
    }

    public void CheckPin() {
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in); 
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN) {
            menu(sc); 
        } else {
            System.out.println("Enter a valid pin");
        }
    }

    public void menu(Scanner sc) { 
        System.out.println("Enter your choice");
        System.out.println("1. Check your A/C balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. Exit");

        

        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withDrawMoney(sc);
        } else if (opt == 3) {
            depositeMoney(sc);
        } else if (opt == 4) {
            System.out.println("Exiting ATM...");
            sc.close(); 
            return; 
        } else {
            System.out.println("Enter valid choice");
        }

        menu(sc); 
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void withDrawMoney(Scanner sc) {
        System.out.println("Enter an amount to withdraw");
        int amount = sc.nextInt();

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Money withdrawn successfully");
        }
    }

    public void depositeMoney(Scanner sc) {
        System.out.println("Enter the amount");
        int amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("Money deposited successfully");
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.setPIN(1234); 
        obj.CheckPin();
    }
}
 
    

