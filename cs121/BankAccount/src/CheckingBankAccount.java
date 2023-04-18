public class CheckingBankAccount {
        static int pin;
    static int balance;
    int deposit;
    static int withdrawal;
    static int irate;
    static int pt; //pt=previous transaction
        String fname, lname, check, save;

        public CheckingBankAccount() {
            this.pin = pin;
            this.balance = balance;
            this.deposit = deposit;
            this.withdrawal = withdrawal;
            this.irate = irate;
        }

        public static void deposit(int amount) {
            balance += amount;
            pt = amount;
            System.out.println("Balance: " + balance);
            System.out.println("Previous Amount: "+pt);
        }

        public static void withdrawal(int amount) {
            if (withdrawal > balance) {
                System.out.println("Insufficient Funds!");
                System.exit(0);
            }
            balance -= amount;
            pt = amount;
            System.out.println("Balance: " + balance);
        }
    public static int interest(int amount) {
        if (balance < 10000) {
            int ir= (int) 0.02;
            balance = (int) (balance + (balance * ir));
            System.out.println("Total Balance: " + balance);
        }
        if (balance > 10000) {
            int ir= (int) 0.05;
            balance = (int) (balance + (balance * ir));
            System.out.println("Total Balance: " + balance);
            }

        return amount;
    }

    public int getBalance() {
        return balance;
    }
    public String getName(){
        return this.fname+this.lname;
    }

    public static int getPin() {
        return pin;
    }

    public static int getIrate() {
        return irate;
    }

}






