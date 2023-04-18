import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args)
    {
        Random rand= new Random();
        Scanner console=new Scanner(System.in);
        String color,guess;
        int correct = 0;
        color = "";

        for (int i=1; i<=10; i++) {
            int number=rand.nextInt(4);
        switch (number)
        {
            case 0:
                color = "Red";
                break;
            case 1:
                color = "Green";
                break;
            case 2:
                color = "Blue";
                break;
            case 3:
                color = "Orange";
                break;
            case 4:
                color = "Yellow";
                break;
        }
            System.out.printf("%d: What Color has the Computer chosen? (Press 'q' to quit) ",i);
            guess=console.nextLine();
            System.out.printf("The computer chose color    %s \n",color);
            if(guess.equals(color)){
                correct++;
            }
            if(guess.equalsIgnoreCase("q")) {
                System.exit(0);

            }
        }
        System.out.printf(" correct answer:  %d \n", correct);






    }
}
