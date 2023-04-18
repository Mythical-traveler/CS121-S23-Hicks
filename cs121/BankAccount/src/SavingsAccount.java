import java.util.Scanner;

public class SavingsAccount {
    Scanner c = new Scanner(System.in);
    static int pin;
    static int balance;
    int deposit;
    static int withdrawal;
    static int irate;
    static int pt; //pt=previous transaction
    String fname, lname, check, save;

    public void CheckingBankAccount(int balance, int pin) {
        this.pin = pin;
        this.balance = balance;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.irate = irate;

    }

    public static void deposit(int amount) {
        balance += amount;
        if (balance < 100) {
            System.out.println("You need at least $100 to have a savings account.");
            System.exit(0);
        }
        pt = amount;
        System.out.println("Balance: " + balance);
        System.out.println("Previous Amount: " + pt);
    }

    public static void withdrawal(int amount) {
        if (withdrawal > balance) {
            System.out.println("Insufficient Funds!");
            System.exit(0);
        }
        balance -= amount;
        pt = amount;
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static int interest(int balance) {
        if (SavingsAccount.balance < 10000) {
            int ir= (int) 0.04;
            irate=ir;
            SavingsAccount.balance = SavingsAccount.balance + (SavingsAccount.balance * ir);
            System.out.println("Total Balance: " + SavingsAccount.balance);
        }
        if (SavingsAccount.balance > 10000) {
            int ir= (int) 0.07;
            SavingsAccount.balance = SavingsAccount.balance + (SavingsAccount.balance * ir);
            System.out.println("Total Balance: " + SavingsAccount.balance);
        }
        return balance;
    }

    private int pin() {
        System.out.println("Enter pin: ");
        pin = c.nextInt();
        return pin;
    }
    public String getName(){
         return this.fname+this.lname;
    }

    public static int getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public static int getIrate() {
        return irate;
    }
}



