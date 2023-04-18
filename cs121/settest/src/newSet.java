import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class newSet {
    public static void main(String [] args)
    {
        Scanner console=new Scanner(System.in);
        Set<Integer> Set=new HashSet<>();
        System.out.println("Enter Length of Array: ");
        int num= console.nextInt();
        int[]array=new int[num];
        for(int i=0;i< array.length;i++)
        {
            System.out.println("Enter Numbers: ");
            array[i]= console.nextInt();
        }
        System.out.println("Array: ");
        for (int numb:array){
            System.out.printf(" %d ",numb);
            Set.add(numb);

        }
        System.out.println();
        System.out.println("Set: ");
        for(int number:Set)
        {
            System.out.printf(" %d ",num);
        }
        System.out.println();
        TreeSet<Integer> sSet=new TreeSet<>(Set);
        System.out.println("Sorted Set: ");
        for(int element: sSet){
            System.out.printf(" %d ",element);
        }


    }
}
