import java.util.*;
public class StudentSet {
    Scanner console=new Scanner(System.in);
    Set<String>students=new HashSet<>();
    public void addStudents()
    {
        System.out.println("Enter Number of Students to be added: ");
        int response= Integer.parseInt(console.nextLine());
        for (int i=0;i<response;i++){
            System.out.println("Enter Name (type 'q' to quit): ");
            String name= console.nextLine();
            students.add(name);
            if (name.equalsIgnoreCase("q"))
            {
                System.exit(0);
            }

        }


    }
    public void displayStudents()
    {
        System.out.println("Set: "+students);
        Iterator v=students.iterator();
        System.out.println("Iterator values: ");
        while (v.hasNext()){
            System.out.println(v.next());
        }

    }


}
