import java.io.*;
import java.util.*;
public class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            String course;
            int grades, credit, cc;

            Scanner console = new Scanner(System.in);
            FileWriter fwrite = new FileWriter("courses2.txt", true);
            PrintWriter of = new PrintWriter(fwrite);
            System.out.println("How many courses do you have? ");
            cc = Integer.parseInt(console.nextLine());
            for (int i = 1; i <= cc; i++) {
                System.out.println("Enter course here: ");
                course = console.nextLine();
                System.out.println("Enter Credits earned: ");
                credit = Integer.parseInt(console.nextLine());
                System.out.println("Enter grade earned: ");
                grades = Integer.parseInt(console.nextLine());
                of.printf("%-7s %3d %7d\n", course, credit, grades);
            }
            of.close();

        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}
