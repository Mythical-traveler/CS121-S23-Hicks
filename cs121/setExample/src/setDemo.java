
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class setDemo {
    public static void main(String [] args){
        Set<Integer> unordered=new HashSet<>();
        int[]array={13,9,6,3,8,1,7};
        System.out.println("Unsorted Set: ");
        for(int num:array)
        {
            System.out.printf("%d ",num);
        }
        System.out.printf("\nArray: %d\nSize: \n\n",array.length,unordered.size());
        TreeSet<Integer>sort=new TreeSet<>(unordered);
        System.out.println("Sorted Set: ");
        for(int element:sort){
            System.out.printf("%d",element);
        }

    }
}
