import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
    public static void main (String [] args) throws IOException
    {
        File file=new File ("courses.txt");
        try {
            Scanner input = new Scanner(file);
            String head = input.nextLine();
            System.out.println(head);

        while (input.hasNext()) {
            String content=input.nextLine();
            System.out.println(content);
        }
        input.close();



            }
        catch (IOException e) {
            System.out.println("File not found!");
        }







        }




    }

