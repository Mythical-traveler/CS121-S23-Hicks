import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        GenericMethods generic = new GenericMethods();
        ArrayList<Integer> intar= new ArrayList<>();
        intar.addAll(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double>doubarr=new ArrayList<>();
        doubarr.addAll(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character>chararr=new ArrayList<>();
        chararr.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        ArrayList<String>strarr= new ArrayList<>();
        strarr.addAll(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));
        System.out.print("Integer Arraylist: ");
        generic.printArrayList(intar);
        System.out.print("Double Arraylist: ");
        generic.printArrayList(doubarr);
        System.out.print("Character Arraylist: ");
        generic.printArrayList(chararr);
        System.out.print("String Arraylist: ");
        generic.printArrayList(strarr);
    }
}
