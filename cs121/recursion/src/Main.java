import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Word: ");
        String test = console.nextLine();
        if (PalindromeDetector.PalCheck(test))
        {
            System.out.println("Your word " + test + " is a palindrome.");
        } else
        {
            System.out.println("Your word " + test + " is not a palindrome.");
        }
        System.out.println("Want to do this again? ('Yes' or 'No')");
        String reply=console.nextLine();
        while (reply.equalsIgnoreCase("Yes")) {
            System.out.println("Enter Word: ");
            String tested = console.nextLine();
            if (PalindromeDetector.PalCheck(tested))
            {
                System.out.println("Your word " + tested + " is a palindrome.");
            } else
            {
                System.out.println("Your word " + tested + " is not a palindrome.");
            }
            System.out.println("Want to do this again? ('Yes' or 'No') ");
            reply=console.nextLine();
        }
        if(reply.equalsIgnoreCase("No"))
        {
            System.exit(0);
        }
    }
}








