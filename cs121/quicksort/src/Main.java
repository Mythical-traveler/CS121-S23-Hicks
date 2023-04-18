import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array={7,4,11,9,8,1};
        int n= array.length;
        Sort thing=new Sort();
        thing.sort(array,0,n-1);
        System.out.println("Sorted Array: ");
        Sort.arrayPrint(array);
    }
}