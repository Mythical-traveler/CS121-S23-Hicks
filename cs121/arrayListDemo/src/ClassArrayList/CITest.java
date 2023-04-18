package ClassArrayList;
import java.util.Scanner;

public class CITest {
    public static void main (String [] args)
    {
        Scanner console=new Scanner(System.in);
        CourseInfo ci=new CourseInfo();
        String Response;
        while(true)
        {

        System.out.println("Enter Course Name or (Enter 'q' to quit) ");
        //ci.addCourse(console.nextLine());
        Response= console.nextLine();
        if(Response.equalsIgnoreCase("q"))
        {
            break;
        }
        else {
            ci.addCourse(Response);
            System.out.println("Enter GPA: ");
            ci.addGpa(Double.parseDouble(console.nextLine()));
            System.out.println("Enter Score: ");
            ci.addScore(Integer.parseInt(console.nextLine()));
            System.out.println("Enter Letter Grade: ");
            ci.addLetter(console.nextLine().charAt(0));
            System.out.println("-----------------------------------");
            ci.display();
            System.out.println();
        }
        }

        }
    }


