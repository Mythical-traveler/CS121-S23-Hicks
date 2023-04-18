import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String [] args) {
        Scanner console= new Scanner(System.in);
        int[]ram= new int[3];
        int[]storage=new int[3];
        boolean[] dm=new boolean[3]; //dual monitor=dm
        for (int i=0;i<3;i++) {
            System.out.println("Enter Ram Count: (in Gigabytes)");
            ram[i] = console.nextInt();
            System.out.println("Enter Storage Count: (In Gigabytes)");
            storage[i] = console.nextInt();
            System.out.println("Do you have Dual Monitors or more? ");
            dm[i] = console.nextBoolean();
        }
        System.out.printf("%-12s %-7s   %12s\n", "Ram Count:","Storage Count:","Dual Monitors:");
        for (int i=0; i<ram.length;i++) {
            System.out.printf("%-14d %-5d %14b\n", ram[i], storage[i], dm[i]);
        }
        console.close();



        }




    }

