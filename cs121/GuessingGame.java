import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;

        System.out.println("Enter a Number between 1- 100: (enter 'q' to quit)");
        String SecNum = console.nextLine();
        //int op = Integer.parseInt(SecNum);
        int op;
        int count = 0;
        while (true) {
            count+=1;
            SecNum=console.nextLine();
            if (SecNum.equals("q")) {
                op = Integer.parseInt(SecNum);
                System.out.println("The Number is: " + num);
                System.exit(0);

            }
            else {
                op = Integer.parseInt(SecNum);
                if (op > num) {
                    System.out.println("Number is too high! Please enter another: ");
                    op = console.nextInt();
                    count++;

                } else if (op < num) {
                    System.out.println("Number is too low! Please enter another: ");
                    op = console.nextInt();
                    count++;
                }

                else if (op == num) {
                    System.out.println("You guessed Correctly!");
                    System.out.println("Number of guesses: " + count);
                }
                else{
                    System.out.println("invalid input");
                }
            }
        }
    }
    }


