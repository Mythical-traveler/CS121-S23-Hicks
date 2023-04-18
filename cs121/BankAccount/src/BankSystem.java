import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {

        String fname, lname, save, check;
        int pin, pc = 0, an=0; //pc=pin choice
        ArrayList<Object> bankAccounts = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Number of accounts being entered: ");
        int z= console.nextInt();
        CheckingBankAccount C[] = new CheckingBankAccount[z];
        SavingsAccount D[] = new SavingsAccount[z];
        for (int i = 0; i < C.length; i++) {
            C[i] = new CheckingBankAccount();
        }
        for (int i = 0; i < D.length; i++) {
            D[i] = new SavingsAccount();
        }
        char choice;
        System.out.println("Enter 'A' to open account");
        System.out.println("Enter 'B' to access account");
        System.out.println("Enter 'C' to Exit System");

        do {
            choice = console.next().charAt(0);
            switch (choice) {
                case 'A':
                    System.out.println("What is your first name?");
                    fname = console.nextLine();
                    System.out.println("What is your last name?");
                    lname = console.nextLine();
                    System.out.println("Create account pin: ");
                    pc = console.nextInt();
                    System.out.println("Create Account Number: ");
                    an = console.nextInt();
                    System.out.printf("Hello %s%s ", fname, lname);
                    System.out.println("Which account type do you want to create? ");
                    System.out.println("use 'check' for checking account and 'save' for savings.");
                    String sc = console.nextLine();
                    if (sc.equalsIgnoreCase("check")) {
                        System.out.println("Press '1' to deposit or '2' to withdraw money.");
                        char fc = console.next().charAt(0);
                        switch (fc) {
                            case '1':
                                System.out.println("Enter amount to deposit: ");
                                int amt = console.nextInt();
                                CheckingBankAccount.deposit(amt);
                                System.out.println(CheckingBankAccount.interest(CheckingBankAccount.balance));
                                System.out.println("Account Number: " + an);
                                System.out.println("Interest Rate: " + CheckingBankAccount.irate);
                            case '2':
                                System.out.println("Enter amount to withdraw: ");
                                amt = console.nextInt();
                                CheckingBankAccount.withdrawal(amt);
                                System.out.println(CheckingBankAccount.interest(CheckingBankAccount.balance));
                                System.out.println("Account Number: " + an);
                                System.out.println("Interest Rate: " + CheckingBankAccount.irate);


                        }
                    }
                    if (sc.equalsIgnoreCase("save")) {
                        System.out.println("Press '1' to deposit or '2' to withdraw money.");
                        char fcc = console.next().charAt(0);
                        switch (fcc) {
                            case '1':
                                System.out.println("Enter amount to deposit: ");
                                int amt = console.nextInt();
                                SavingsAccount.deposit(amt);
                                System.out.println("Total plus interest: " + SavingsAccount.interest(SavingsAccount.balance));
                                System.out.println("Account Number: " + an);
                                System.out.println("Interest Rate: " + SavingsAccount.irate);
                            case '2':
                                System.out.println("Enter amount to withdraw: ");
                                amt = console.nextInt();
                                SavingsAccount.withdrawal(amt);
                                System.out.println("Total plus interest: " + SavingsAccount.interest(SavingsAccount.balance));
                                System.out.println("Account Number: " + an);
                                System.out.println("Interest Rate: " + SavingsAccount.irate);
                        }
                    }
                case 'c':
                    System.exit(0);

                case 'b':
                    System.out.println("Enter Pin: ");
                    pin = console.nextInt();
                    if (pin != pc) {
                        System.out.println("Error! Pin not valid");
                    }
                    System.out.println("You have "+z+" accounts with"+ sc.get[i]);
                    System.out.println("Which account do you want to use: ");



            }

        }
        while (choice != 'c');
    }

    public CheckingBankAccount existent() {
        for (CheckingBankAccount account : CheckingBankAccount) {
            if (CheckingBankAccount.getPin() == CheckingBankAccount.pin) {
                return account;
            }

        }

        return null;
    }

    public SavingsAccount existent() {
        for (SavingsAccount account : SavingsAccount) {
            if (SavingsAccount.getPin() == SavingsAccount.pin) {
                return account;
            }
        }
        return null;
    }
}


