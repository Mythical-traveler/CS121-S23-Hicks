import java.util.Scanner;

public class TestAverage {
    public static void main (String [] args) {
        Scanner console= new Scanner(System.in);
        int stdtct,tstct,total = 0,score;
        double avg;

        System.out.println("Enter Total number of Students: ");
        stdtct=Integer.parseInt(console.nextLine());

        System.out.println("Enter number of tests per student: ");
        tstct=Integer.parseInt(console.nextLine());
        System.out.println();

        for (int i=1; i<=stdtct; i++) {
            total=0;
            System.out.printf("Scores for student %d",i);
            for (int j = 1; j <= tstct; j++)
            {
                System.out.printf("Enter score for test: %d " , j);
                //score = console.nextInt();
                score = Integer.parseInt(console.nextLine());
                total+=score;
            }
            avg = total/tstct;
            System.out.printf("The average for student %d is: %.2f\n\n",i,avg);
        }
        System.exit(0);




    }


        }

