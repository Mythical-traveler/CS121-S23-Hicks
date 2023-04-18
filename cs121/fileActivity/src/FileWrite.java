import java.io.*;
import java.util.*;
public class FileWrite {
    public static void main(String[] args) throws IOException {
        try {
            String course;
            int grades, credit, cc;

            Scanner console = new Scanner(System.in);
            File file = new File("courses2.txt");
            PrintWriter outputFile = new PrintWriter(file);
            outputFile.printf("%s %s %s\n", "Courses", "Credits", "Score");
            System.out.println("How many courses do you have? ");
            cc = Integer.parseInt(console.nextLine());
            for (int i = 1; i <= cc; i++) {
                System.out.println("Enter course here: ");
                course = console.nextLine();
                System.out.println("Enter Credits earned: ");
                credit = Integer.parseInt(console.nextLine());
                System.out.println("Enter grade earned: ");
                grades = Integer.parseInt(console.nextLine());
                outputFile.printf("%-7s %3d %7d\n", course, credit, grades);
            }
            outputFile.close();

        }catch (IOException e) {
            System.out.println("Error!");


        }

    }

}
