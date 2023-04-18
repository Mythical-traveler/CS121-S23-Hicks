import java.util.ArrayList;

public class BSDemo {
    public static int binarySearch(ArrayList<Integer> arr, int l, int r, int x) {
        if (r>=l){
            int middle=l+(r-l)/2;
            if(arr.get(middle)==x)
            {
                return middle;
            }
            if(arr.get(middle)>x)
            {
                return binarySearch(arr,l,middle-1,x);
            }
            return binarySearch(arr, middle + 1, r, x);
        }
        return -1;
    }
}


