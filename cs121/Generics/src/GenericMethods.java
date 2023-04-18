import java.util.*;

public class GenericMethods {
    public <E> void printArrayList(ArrayList<E>array){
        for (E element: array)
        {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
}
