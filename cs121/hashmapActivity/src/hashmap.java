import java.util.*;
public class hashmap {
    HashMap<String, Double> UIMap = new HashMap<>();
    Scanner console = new Scanner(System.in);


    public void addtoHash() {

        int count = 0;

        while (true) {
            System.out.println("Enter Information?(type in 'n' to stop entering)");
            System.out.println("Enter Planetary Name: ");
            String response = console.nextLine();
            if (!response.equalsIgnoreCase("n")) {
                String name = response;
                System.out.println("Enter Distance(in AU or light years): ");
                Double distance = Double.parseDouble(console.nextLine());
                UIMap.put(name, distance);
                System.out.println(UIMap);
                count++;

            } else {
                return;
            }

            // String response= console.nextLine();

            /*System.out.println("Enter Text: ");
            String three= console.nextLine();
            System.out.println("Enter Text Two: ");
            String four= console.nextLine();
            UIMap.put(three,four);
            System.out.println("Enter More?(type in 'y' for yes and 'n' for no.)");
            String sresp= console.nextLine();
            System.out.println(UIMap);
            if (sresp.equalsIgnoreCase("n")){
                System.exit(0);
            }*/

        }
        /*if (response.equalsIgnoreCase("n"))
        {
            System.exit(0);
        }*/

        /*
        ORIGINAL CODE
        * public void addtoHash()
    {
        System.out.println("Enter Planetary Name: ");
        String name= console.nextLine();
        System.out.println("Enter Distance: ");
        int distance= Integer.parseInt(console.nextLine());
        UIMap.put(name,distance);
        System.out.println(UIMap);
        System.out.println("Enter More?(type in 'y' for yes and 'n' for no.)");
        String response= console.nextLine();
        while (response.equalsIgnoreCase("y"))
        {
            System.out.println("Enter Text: ");
            String three= console.nextLine();
            System.out.println("Enter Text Two: ");
            String four= console.nextLine();
            UIMap.put(three,four);
            System.out.println("Enter More?(type in 'y' for yes and 'n' for no.)");
            String sresp= console.nextLine();
            System.out.println(UIMap);
            if (sresp.equalsIgnoreCase("n")){
                System.exit(0);
            }

        }
        if (response.equalsIgnoreCase("n"))
        {
            System.exit(0);
        }

        *
        * */

    }

    public void removefromHash() {
        System.out.println("Enter Value to be removed: ");
        String output = console.nextLine();
        UIMap.remove(output);


    }

    public String getValue() {
        System.out.println("Enter Value key: ");
        String key = console.nextLine();
        UIMap.get(key);
        return key;
    }

    public void display() {
        for (String key : UIMap.keySet()) {
            System.out.println(key);
        }
        System.out.println(UIMap);
    }
}

